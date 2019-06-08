
package datos;

import entidades.*;
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
            mensaje="true";
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
}
