
package entidades;
import java.util.Comparator;

public class ClienteCiudad implements Comparator<Cliente> {

    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        return cliente1.getCiudad().compareTo(cliente2.getCiudad());
    }
    
    
}
