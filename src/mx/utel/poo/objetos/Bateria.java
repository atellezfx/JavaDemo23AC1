package mx.utel.poo.objetos;

public record Bateria(float voltaje, int amperaje, boolean recargable) {

    @Override
    public String toString() {
        String cadena = "Batería %.2fv con %dmha %s";
        return cadena.formatted(voltaje, amperaje, recargable ? "recargable" : "alcalina");
    }

}
