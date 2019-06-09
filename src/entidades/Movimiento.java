
package entidades;

import java.util.Objects;

/**
 *
 * @author R000R
 */
public class Movimiento implements Comparable<Movimiento> {
    String codigo ;
    String descripcion;
    String accion;
    String estado;

    public Movimiento(String codigo, String descripcion, String accion, String estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.accion = accion;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int compareTo(Movimiento movimiento) {
     return this.getCodigo().compareTo(movimiento.getCodigo());
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
        final Movimiento other = (Movimiento) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    @Override
      public String toString() {
          return " Codigo "+this.getCodigo()+" Descripcion "+this.getDescripcion()
                  +" Accion "+this.getAccion()+" Estado "+this.getEstado();
      }

    
    
}
