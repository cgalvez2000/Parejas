package minespain.controlador;
import minespain.modelo.Tablero;
/**
 * Created by carlos2000 on 11/08/2015.
 */
public class   UltimaPareja extends Condicion {
    UltimaPareja() {
    }

    @Override
    public boolean seCumple(ContextoEjecucion contexto) {
        Tablero tablero = (Tablero)contexto.obtenerValor(Tablero.class); // obtiene el tablero guardado en el contexto de ejecución
        return tablero.numeroParejasDescubiertas() == tablero.numeroTotalParejas();

    }
}
