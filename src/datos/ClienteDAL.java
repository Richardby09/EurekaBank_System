
package datos;

import entidades.*;
import java.util.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class ClienteDAL {

    private static Connection cn = null;
    private static PreparedStatement ps = null;
    private static Statement st = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    public static String insertarCliente(Cliente cliente) {
        String mensaje = null;
        try {
            cn = Conexion.establishConnection();
            String sql = "{call sp_insertarCliente(?,?,?,?,?,?,?,?,?)}";
            ps = cn.prepareStatement(sql);
            ps.setString(1, cliente.getCodigo());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getCiudad());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getTelefono());
            ps.setString(6, cliente.getDni());
            ps.setString(7, cliente.getApaterno());
            ps.setString(8, cliente.getAmaterno());
            ps.setString(9, cliente.getEmail());                               
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

    public static String buscarCliente(String codigo) {
        try {
            cn = Conexion.establishConnection();
            String sql = "select * from Cliente where cliecodigo = ?";
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

    public static ArrayList<Cliente> listarCliente() {

        ArrayList<Cliente> cliente = new ArrayList<>();
        try {
            cn = Conexion.establishConnection();
            st = cn.createStatement();
            String sql = "select * from Cliente";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cliente.add(
                        new Cliente(
                                rs.getString(1), rs.getString(2), rs.getString(3),
                                rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7),
                                rs.getString(8),rs.getString(9)
                        )
                );
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
        return cliente;
    }
    
     public static String actualizarCliente(Cliente cliente) {
        String sql, mensaje = null;
        try {
            cn = Conexion.establishConnection();
            sql = "{call sp_actualizarCliente(?,?,?,?,?,?,?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, cliente.getCodigo());
            cs.setString(2, cliente.getNombre());
            cs.setString(3, cliente.getCiudad());
            cs.setString(4, cliente.getDireccion());
            cs.setString(5, cliente.getCodigo());
            cs.setString(6, cliente.getNombre());
            cs.setString(7, cliente.getCiudad());
            cs.setString(8, cliente.getDireccion());
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
    
    public static String eliminarCliente(String codigo) {
        String sql, mensaje = null;
        try {
            cn = Conexion.establishConnection();
            sql = "{call sp_eliminaCliente(?)}";
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
