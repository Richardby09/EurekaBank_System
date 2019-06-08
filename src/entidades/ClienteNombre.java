
package entidades;
import java.util.Comparator;

public class ClienteNombre  implements Comparator<Cliente> {

    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        return cliente1.getNombre().compareToIgnoreCase(cliente2.getNombre());
    }
    
    
}
