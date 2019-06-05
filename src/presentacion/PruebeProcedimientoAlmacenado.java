/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import datos.*;
import java.sql.*;
/**
 *
 * @author R000R
 */
public class PruebeProcedimientoAlmacenado {
    public static void main(String[] args) {
        Connection cn =null;
        CallableStatement cs= null;
        Double saldo;
        String sql;
        try{
            cn=Conexion.establishConnection();
            sql="{call sp_consultarSaldoCuenta(?,?)}";
            cs=cn.prepareCall(sql);
            cs.setString(1,"00200001");
            cs.registerOutParameter("p_saldo",java.sql.Types.DECIMAL);
            cs.execute();
            saldo=cs.getDouble("p_saldo");
            if(cs.wasNull()){
                System.out.println("cuenta no existe");
                 }else {
                   System.out.println("saldo:"+saldo);
            }             
        }catch (ClassNotFoundException| SQLException ex){
               System.out.println(ex.getMessage());
        }finally{
            try{
                cn.close();
                cs.close();
            }catch (SQLException ex)
            {
                   System.out.println(ex.getMessage());   
            }
                
           
        }
             
        
        
    }
 
}
