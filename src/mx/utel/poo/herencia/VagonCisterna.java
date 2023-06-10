package mx.utel.poo.herencia;

public class VagonCisterna extends Vagon {

    private float largo, radio;

    public VagonCisterna(String contenido) {
        this(contenido, 12.3f, 2.4f);
    }

    public VagonCisterna(String contenido, float largo, float radio) {
        super(contenido);
        this.largo = largo;
        this.radio = radio;
    }

    @Override
    public float volumen() {
        float radio2 = (float) Math.pow( radio, 2 );
        return (float) (Math.PI * radio2 * largo);
    }
}
