
package datos;

import entidades.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author R000R
 */
public class MovimientoDAL {
    
      private static CallableStatement cs = null;
    private static Connection cn = null;
    private static PreparedStatement ps = null;
    private static Statement st = null;
    private static ResultSet rs = null;

    public static String insertarMovimiento(Movimiento movimiento) {
        String mensaje = null;
        try {
            cn = Conexion.establishConnection();
            String sql = "{call sp_insertarMovimiento(?,?,?,?)}";
            ps = cn.prepareStatement(sql);
            ps.setString(1,movimiento.getCodigo() );
            ps.setString(2,movimiento.getDescripcion() );
            ps.setString(3, movimiento.getAccion());
            ps.setString(4,movimiento.getEstado() );                                  
            ps.executeUpdate();
            mensaje="Registro insertado";
        } catch (ClassNotFoundException | SQLException ex) {
            mensaje = ex.getMessage();
        } finally {
            try {
                ps.close();
                cn.close();
            } catch (SQLException ex) {
                mensaje = ex.getMessage();
            }
        }

        return mensaje;
    }

    public static String buscarMovimiento(String codigo) {
        try {
            cn = Conexion.establishConnection();
            String sql = "select * from Movimiento where tipocodigo = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1,codigo);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }                        

        } catch (ClassNotFoundException | SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Erro:r", 0);
        } finally {
            try {
                ps.close();
                cn.close();
                rs.close();

            } catch (SQLException ex) {
                showMessageDialog(null, ex.getMessage(), "Error", 0);

            }
        }
        return null;
    }

    public static ArrayList<Movimiento> listarMovimiento() {

        ArrayList<Movimiento> movimiento = new ArrayList<>();
        try {
            cn = Conexion.establishConnection();
            st = cn.createStatement();
            String sql = "select * from Movimiento";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                movimiento.add( new Movimiento( rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4) ));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } finally {
            try {
                cn.close();
                rs.close();

            } catch (SQLException ex) {
                showMessageDialog(null, ex.getMessage(), "Error", 0);

            }
        }
        return movimiento;
    }
    
    
    public static String actualizarMovimiento(Movimiento movi) {
        String sql, mensaje = null;
        try {
            cn = Conexion.establishConnection();
            sql = "{call sp_modificarMovimiento(?,?,?,?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, movi.getCodigo());
            cs.setString(2, movi.getDescripcion());
            cs.setString(3, movi.getAccion());
            cs.setString(4, movi.getEstado());
            cs.executeUpdate();
        } catch(ClassNotFoundException | SQLException ex) {
            mensaje = ex.getMessage();
        } finally {
            try {
                cs.close();
                cn.close();
            } catch(SQLException ex) {
                mensaje = ex.getMessage();
            }            
        }
        return mensaje;
    }
    
    public static String eliminarMovimiento(String codigo) {
        String sql, mensaje = null;
        try {
            cn = Conexion.establishConnection();
            sql = "{call sp_eliminarMovimiento(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            cs.executeUpdate();
        } catch(ClassNotFoundException | SQLException ex) {
            mensaje = ex.getMessage();
        } finally {
            try {
                cs.close();
                cn.close();
            } catch(SQLException ex) {
                mensaje = ex.getMessage();
            }            
        }
        return mensaje;
    }
    
    
    
}
