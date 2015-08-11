package minespain.modelo;

import java.util.Vector;

/**
 * Created by carlos2000 on 09/08/2015.
 */
public class Tablero {
    private Vector<Pareja> parejas = new Vector<Pareja>();

    public Vector<Pareja> getParejas() {
        return parejas;
    }

    public void setParejas(Vector<Pareja> parejas) {
        this.parejas = parejas;
    }

    public void addPareja(Pareja pareja) {
        this.getParejas().add(pareja);
    }

    public void removePareja(Pareja pareja) {
        this.getParejas().remove(pareja);
    }

    public int numeroTotalParejas() {
        return this.getParejas().size(); // el número de parejas existentes
    }

    public int numeroParejasDescubiertas() {
// recorre la colección de parejas y cuenta las que están descubiertas
        int contador = 0;
        for (Pareja pareja : this.getParejas())
            if (pareja.descubierta()) contador++;
        return contador;
    }
}
