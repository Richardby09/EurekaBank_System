/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import entidades.*;
import datos.*;
import java.util.*;

public class ClienteBL {

    public static String insertarCliente(String codigo, String nombre, String ciudad, String direccion,
            String telefono, String dni, String Apaterno, String Amaterno, String email) {
        String mensaje;
        if (codigo.trim().length() == 5 && nombre.trim().length() > 1 && nombre.trim().length() <= 30
                && ciudad.trim().length() > 1 && ciudad.trim().length() <= 30 && direccion.trim().length() > 1
                && direccion.trim().length() <= 50 &&telefono.trim().length()>1 && telefono.trim().length()>20
                && dni.trim().length()==8&&Apaterno.trim().length()>1 &&Apaterno.trim().length()<=25 &&
                Amaterno.trim().length()>1 &&Amaterno.trim().length()<=25&& email.trim().length()>1 
                &&email.trim().length()<=50 ){
            
            if (buscarCliente(codigo) == null) {
                Cliente cliente = new Cliente(codigo, nombre, ciudad, direccion,telefono,dni,Apaterno,Amaterno,email);
                mensaje = ClienteDAL.insertarCliente(cliente);
            } else {
                mensaje = "Código de sucursal y existe";
            }
        } else {
            mensaje = "Datos no válidos";
        }
        return mensaje;
    }

    public static String buscarCliente(String codigo) {
        if (codigo.trim().length() == 3) {
            return ClienteDAL.buscarCliente(codigo);
        } else {
            return "Dato no válido";
        }
    }

    public static ArrayList<Cliente> listarCliente() {
        return ClienteDAL.listarCliente();
    }
    
     public static String actualizarCliente(String codigo, String nombre, String ciudad, String direccion,
            String telefono, String dni, String Apaterno, String Amaterno, String email) {
        String mensaje;
        if(codigo.trim().length() == 5 && nombre.trim().length() > 1 && nombre.trim().length() <= 30
                && ciudad.trim().length() > 1 && ciudad.trim().length() <= 30 && direccion.trim().length() > 1
                && direccion.trim().length() <= 50 &&telefono.trim().length()>1 && telefono.trim().length()>20
                && dni.trim().length()==8&&Apaterno.trim().length()>1 &&Apaterno.trim().length()<=25 &&
                Amaterno.trim().length()>1 &&Amaterno.trim().length()<=25&& email.trim().length()>1 
                &&email.trim().length()<=50 ) {
            Cliente cliente = new Cliente(codigo, nombre, ciudad, direccion,telefono,dni,Apaterno,Amaterno,email);
            mensaje = ClienteDAL.actualizarCliente(cliente);
            if(mensaje == null) {
                mensaje = "Registro actualizado";
            }
        } else {
            mensaje = "Datos no válidos";
        }
        return mensaje;
    }
    
    public static String eliminarCliente(String codigo) {
        String mensaje;
        if(codigo.trim().length()==3) {
            mensaje = ClienteDAL.eliminarCliente(codigo);
            if(mensaje == null) {
                mensaje = "Registro eliminado";
            }
        } else
            mensaje = "Dato no válido";
        return mensaje;
    }
}
