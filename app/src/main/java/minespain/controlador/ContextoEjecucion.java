package minespain.controlador;

import java.util.Hashtable;

/**
 * Created by carlos2000 on 11/08/2015.
 */
public class ContextoEjecucion {

    private Hashtable elementos = new Hashtable();

    public void poner(Object clave, Object valor) {
        this.getElementos().put(clave, valor);
    }

    public Object obtenerValor(Object clave) {
        return this.getElementos().get(clave);
    }

    private Hashtable getElementos() {
        return elementos;
    }

    private void setElementos(Hashtable elementos) {
        this.elementos = elementos;
    }
}
