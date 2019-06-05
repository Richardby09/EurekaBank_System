/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author adriana
 */
import entidades.*;
import datos.*;
import java.util.*;

public class SucursalBL {

    public static String insertarSucursal(String codigo, String nombre, String ciudad, String direccion) {
        String mensaje;
        if (codigo.trim().length() == 3 && nombre.trim().length() > 1 && nombre.trim().length() <= 50
                && ciudad.trim().length() > 1 && ciudad.trim().length() <= 30 && direccion.trim().length() > 1
                && direccion.trim().length() <= 50) {
            if (buscarSucursal(codigo) == null) {
                Sucursal sucursal = new Sucursal(codigo, nombre, ciudad, direccion);
                mensaje = SucursalDAL.insertarSucursal(sucursal);
            } else {
                mensaje = "Código de sucursal y existe";
            }
        } else {
            mensaje = "Datos no válidos";
        }
        return mensaje;
    }

    public static String buscarSucursal(String codigo) {
        if (codigo.trim().length() == 3) {
            return SucursalDAL.buscarSucursal(codigo);
        } else {
            return "Dato no válido";
        }
    }

    public static ArrayList<Sucursal> listarSucursales() {
        return SucursalDAL.listarSucursales();
    }
}
