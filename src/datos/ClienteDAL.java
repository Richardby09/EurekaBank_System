
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
            cs = cn.prepareCall(sql);
            cs.setString(1, cliente.getCodigo());
            cs.setString(2, cliente.getApaterno());
            cs.setString(3, cliente.getAmaterno());
            cs.setString(4, cliente.getNombre());
            cs.setString(5, cliente.getDni());
            cs.setString(6, cliente.getCiudad());
            cs.setString(7, cliente.getDireccion());
            cs.setString(8, cliente.getTelefono());            
            cs.setString(9, cliente.getEmail());                               
            cs.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
            mensaje = ex.getMessage();
        } finally {
            try {
                cs.close();
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
            String sql = "{call sp_buscarCliente(?)}";
           cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }                        

        } catch (ClassNotFoundException | SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } finally {
            try {
                cs.close();
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
            String sql = "{call sp_listarClientes()}";
            cs = cn.prepareCall(sql);            
            rs = cs.executeQuery(sql);
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
            sql = "{call sp_actualizarCliente(?,?,?,?,?,?,?,?,?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, cliente.getCodigo());
            cs.setString(2, cliente.getApaterno());
            cs.setString(3, cliente.getAmaterno());
            cs.setString(4, cliente.getNombre());
            cs.setString(5, cliente.getDni());                    
            cs.setString(6, cliente.getCiudad());
            cs.setString(7, cliente.getDireccion());
            cs.setString(8, cliente.getTelefono());
            cs.setString(9, cliente.getEmail());     
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
            //mensaje = ex.getMessage();
             mensaje="LA 1";
        } finally {
            try {
                cs.close();
                cn.close();
            } catch(SQLException ex) {
               // mensaje = ex.getMessage();
               mensaje="LA 2";
            }            
        }
        return mensaje;
    }
}
