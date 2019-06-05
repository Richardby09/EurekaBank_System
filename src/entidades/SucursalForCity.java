/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.util.Comparator;
/**
 *
 * @author adriana
 */
public class SucursalForCity implements Comparator<Sucursal> {

    @Override
    public int compare(Sucursal sucursal1, Sucursal sucursal2) {
        return sucursal1.getCiudad().compareToIgnoreCase(sucursal2.getCiudad());
    }
    
    
}
