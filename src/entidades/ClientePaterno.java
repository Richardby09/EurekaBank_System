
package entidades;

import java.util.Comparator;
public class ClientePaterno implements Comparator<Cliente> {

    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        return cliente1.getApaterno().compareTo(cliente2.getApaterno());

    }

}
