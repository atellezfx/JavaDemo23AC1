package mx.utel.poo.herencia;

public abstract class Vagon {

    private final String CONTENIDO;

    public Vagon(String CONTENIDO) {
        this.CONTENIDO = CONTENIDO;
    }

    public String obtenerContenido() {
        return CONTENIDO;
    }

    public abstract float volumen();

    public String tipo() {
        String nombre = this.getClass().getSimpleName();
        nombre = nombre.replace("Vagon", "");
        return nombre.toLowerCase();
    }

    @Override
    public String toString() {
        return String.format("Vagón %s con un volúmen de %.2fm³", tipo(), volumen());
    }
}

