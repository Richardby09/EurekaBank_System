/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author R000R
 */
import entidades.Sucursal;
import java.util.ArrayList;
import java.util.Iterator;
import logica.*;
import javax.swing.*;

public class TableExample {

    JFrame f;

    TableExample() {
        
        Sucursal sucu;
         ArrayList<Sucursal> sucursales = SucursalBL.listarSucursales();
        f = new JFrame();
        String data[][] = new String[sucursales.size()][4];
        String column[] = {"Cogigo", "Nombre", "Ciudad", "Direccion"};       
        Iterator<Sucursal> iterador=sucursales.iterator();
        int i=0;
        while(iterador.hasNext()){
            sucu = iterador.next();
            
            data[i][0]=sucu.getCodigo();
            data[i][1]=sucu.getNombre();
            data[i][2]=sucu.getCiudad();
            data[i][3]=sucu.getDireccion();            
            i++;            
        }  
        
        
        JTable jt = new JTable(data, column);
        jt.setBounds(500, 40, 200, 200);
        JScrollPane sp = new JScrollPane(jt);

        f.add(sp);
        f.setSize(600, 250);
        f.setVisible(true);
        f.setLocation(500,310);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    }

    public static void main(String[] args) {
        new TableExample();
        
    }
}
