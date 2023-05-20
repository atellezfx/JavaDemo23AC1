package mx.utel.poo.objetos;

public record Foco(Modelo tipo, Luz luz) {

    @Override
    public String toString() {
        String cadena = "Foco tipo %s con luz %s";
        return cadena.formatted(tipo, luz);
    }
}
