
package entidades;

import java.util.Comparator;

/**
 *
 * @author R000R
 */
public class MovimientoAccion implements Comparator<Movimiento> {

    @Override
    public int compare(Movimiento t, Movimiento t1) {
        return t.getAccion().compareTo(t1.getAccion());
    }
    
    
}
