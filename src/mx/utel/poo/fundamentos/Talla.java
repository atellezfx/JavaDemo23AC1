package mx.utel.poo.fundamentos;

public enum Talla {

    CHICA(5), MEDIANA(5), GRANDE(6), EXTRA_GRANDE(7);

    private int diferencia;

    Talla(int diferencia) {
        this.diferencia = diferencia;
    }

    public int getDiferencia() {
        return diferencia;
    }
}
