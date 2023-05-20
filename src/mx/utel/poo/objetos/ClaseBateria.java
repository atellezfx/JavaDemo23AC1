package mx.utel.poo.objetos;

public class ClaseBateria {

    private float voltaje;
    private int amperaje;
    private boolean recargable;

    public ClaseBateria(float voltaje, int amperaje, boolean recargable) {
        this.voltaje = voltaje;
        this.amperaje = amperaje;
        this.recargable = recargable;
    }

    public float getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(float voltaje) {
        if( voltaje > 0) this.voltaje = voltaje;
    }

    public int getAmperaje() {
        return amperaje;
    }

    public void setAmperaje(int amperaje) {
        this.amperaje = amperaje;
    }

    public boolean isRecargable() {
        return recargable;
    }

    public void setRecargable(boolean recargable) {
        this.recargable = recargable;
    }

    @Override
    public String toString() {
        String cadena = "Batería %.2fv con %dmha %s";
        return cadena.formatted(voltaje, amperaje, recargable ? "recargable" : "alcalina");
    }
}
