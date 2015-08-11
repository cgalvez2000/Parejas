package minespain.modelo;

/**
 * Created by carlos2000 on 10/08/2015.
 */
public class Pareja {
    private int imagen;
    private Ficha primera;
    public Ficha segunda;


    public Ficha getSegunda() {
        return segunda;
    }

    public void setSegunda(Ficha segunda) {
        this.segunda = segunda;
    }

    public Ficha getPrimera() {
        return primera;
    }

    public void setPrimera(Ficha primera) {
        this.primera = primera;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public boolean descubierta() {
        return !this.getPrimera().isOculta() && !this.getSegunda().isOculta(); // ambas fichas no están ocultas
    }

}
