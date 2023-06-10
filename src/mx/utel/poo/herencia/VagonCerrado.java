package mx.utel.poo.herencia;

public class VagonCerrado extends Vagon {

    private float ladoA, ladoB, largo;

    public VagonCerrado(String contenido) {
        this(contenido, 3.0f, 3.05f, 15.4f);
    }

    public VagonCerrado(String contenido, float ladoA, float ladoB, float largo) {
        super(contenido);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.largo = largo;
    }

    @Override
    public float volumen() {
        return ladoA * ladoB * largo;
    }
}
