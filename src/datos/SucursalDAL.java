/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.*;
import java.util.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author adriana
 */
public class SucursalDAL {

    private static Connection cn = null;
    private static PreparedStatement ps = null;
    private static Statement st = null;
    private static ResultSet rs = null;

    public static String insertarSucursal(Sucursal sucursal) {
        String mensaje = null;
        try {
            cn = Conexion.establishConnection();
            String sql = "insert into sucursal(sucucodigo,sucunombre,"
                    + "sucuciudad,sucudireccion,sucucontcuenta) values(?,?,?,?,?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, sucursal.getCodigo());
            ps.setString(2, sucursal.getNombre());
            ps.setString(3, sucursal.getCiudad());
            ps.setString(4, sucursal.getDireccion());
            ps.setInt(5, sucursal.getContcuenta());                    
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

    public static String buscarSucursal(String codigo) {
        try {
            cn = Conexion.establishConnection();
            String sql = "select * from Sucursal where sucucodigo = ?";
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

    public static ArrayList<Sucursal> listarSucursales() {

        ArrayList<Sucursal> sucursales = new ArrayList<>();
        try {
            cn = Conexion.establishConnection();
            st = cn.createStatement();
            String sql = "select * from Sucursal";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                sucursales.add(
                        new Sucursal(
                                rs.getString(1), rs.getString(2), rs.getString(3),
                                rs.getString(4), rs.getInt(5)
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
        return sucursales;
    }
}
