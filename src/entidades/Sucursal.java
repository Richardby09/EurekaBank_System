/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author adriana
 */
public class Sucursal implements Comparable<Sucursal> {

    private String codigo;
    private String nombre;
    private String ciudad;
    private String direccion;
    private int contcuenta;

    public Sucursal() {
        this.codigo = "NCC";
        this.nombre = "NN";
        this.ciudad = "Nc";
        this.direccion = "ND";
        this.contcuenta = 0;
    }

    public Sucursal(String codigo, String nombre, String ciudad, String direccion, int contcuenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.contcuenta = contcuenta;
    }
    

    public Sucursal(String codigo, String nombre, String ciudad, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.contcuenta = 0;
    }

    public Sucursal(String codigo, String nombre, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.contcuenta = 0;
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

    public int getContcuenta() {
        return contcuenta;
    }

    public void setContcuenta(int contcuenta) {
        this.contcuenta = contcuenta;
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
        final Sucursal other = (Sucursal) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Sucursal sucursal) {
        return this.getCodigo().compareTo(sucursal.getCodigo());
    }

    public String toString() {
        return "\nCódigo: " + this.getCodigo() + "\nNombres: " + this.getNombre()
                + "\nCiudad: " + this.getCiudad() + "\nDireccion: " + this.getDireccion()
                + "\nNúmero de cuentas: " + this.getContcuenta();
    }

}
