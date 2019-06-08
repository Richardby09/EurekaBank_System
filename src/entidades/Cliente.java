/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Objects;


public class Cliente implements Comparable<Cliente> {

    private String codigo;
    private String nombre;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String dni;
    private String Apaterno;
    private String Amaterno;
    private String email;

    public Cliente() {
        this.codigo = "NCC";
        this.nombre = "NN";
        this.ciudad = "NC";
        this.direccion = "ND";
        this.telefono="NT";
        this.dni="ND";
        this.Apaterno="NP";
        this.Amaterno="NM";
    }

    public Cliente(String codigo, String nombre, String ciudad, String direccion,
            String telefono, String dni, String Apaterno, String Amaterno, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.Apaterno = Apaterno;
        this.Amaterno = Amaterno;
        this.email = email;
    }

    public Cliente(String codigo, String nombre, String ciudad, String direccion, String telefono, String dni, String Apaterno, String Amaterno) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.Apaterno = Apaterno;
        this.Amaterno = Amaterno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApaterno() {
        return Apaterno;
    }

    public void setApaterno(String Apaterno) {
        this.Apaterno = Apaterno;
    }

    public String getAmaterno() {
        return Amaterno;
    }

    public void setAmaterno(String Amaterno) {
        this.Amaterno = Amaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Cliente cliente) {
        return this.getCodigo().compareTo(cliente.getCodigo());
    }

    public String toString() {
        return "Codigo "+ this.getCodigo()+"Nombre"+this.getNombre()+"Ciudad"+this.getCiudad()+"Direccion"+this.getDireccion()
                +"Telefono"+this.getTelefono()+"Dni"+this.getDni()+"Apellido Paterno"+this.getApaterno()+
                "Apellido Materno"+this.Amaterno+"Email"+this.getEmail();
    }

}
