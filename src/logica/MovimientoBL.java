
package logica;
import entidades.*;
import datos.*;
import java.util.ArrayList;

/**
 *
 * @author R000R
 */
public class MovimientoBL {
   
     public static String insertarMovimiento(String codigo, String descripcion, String accion, String estado){
          String mensaje;
        if(codigo.trim().length()==5&& descripcion.trim().length()>1 &&descripcion.trim().length()<=40
                &&accion.trim().length()>1 && accion.trim().length()<=10&&
                estado.trim().length()>1&&estado.trim().length()<=15 ){
            if(MovimientoDAL.buscarMovimiento(codigo)==null){
                Movimiento movimiento= new Movimiento(codigo,descripcion,accion,estado);
                mensaje=MovimientoDAL.insertarMovimiento(movimiento);
            }else mensaje="ERROR CODIGO ENCONTRADO";
        }else mensaje="DATOS INVALIDOS";
        return mensaje;
    }
    
    public static ArrayList<Movimiento> listarMovimiento(){
        
        return MovimientoDAL.listarMovimiento();
    }
     public static String buscarMovimiento(String codigo){
        if (codigo.trim().length()==5){
            return MovimientoDAL.buscarMovimiento(codigo);
            
        }
        else{return "Dato no válido";}
    }

    
    
    
    
    
    
    
    
}
