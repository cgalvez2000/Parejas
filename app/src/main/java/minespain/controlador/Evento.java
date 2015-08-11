package minespain.controlador;

/**
 * Created by carlos2000 on 11/08/2015.
 */
public class Evento extends Disparador {
    public static final Evento COMIENZO_JUEGO = new Evento();

    private Evento() {
    }

    public boolean seCumple(ContextoEjecucion contexto) {
        return true;//TODO FALTA IMPLEMENTAR ESTE METODO
    }
}
