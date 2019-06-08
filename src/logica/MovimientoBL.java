
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
        if(codigo.trim().length()==3&& descripcion.trim().length()>1 &&descripcion.trim().length()<=40
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
      public static String actualizarMovimiento(String codigo, String descripcion, String accion, String estado) {
        String mensaje;
        if(codigo.trim().length()==3&& descripcion.trim().length()>1 &&descripcion.trim().length()<=40
                &&accion.trim().length()>1 && accion.trim().length()<=10&&
                estado.trim().length()>1&&estado.trim().length()<=15 ) {
            Movimiento movimiento = new Movimiento(codigo,descripcion,accion,estado);
            mensaje = MovimientoDAL.actualizarMovimiento(movimiento);
            if(mensaje == null) {
                mensaje = "Registro actualizado";
            }
        } else {
            mensaje = "Datos no válidos";
        }
        return mensaje;
    }
    
    public static String eliminarMovimiento(String codigo) {
        String mensaje;
        if(codigo.trim().length()==3) {
            mensaje = MovimientoDAL.eliminarMovimiento(codigo);
            if(mensaje == null) {
                mensaje = "Registro eliminado";
            }
        } else
            mensaje = "Dato no válido";
        return mensaje;
    }

    
    
    
    
    
    
    
    
}
