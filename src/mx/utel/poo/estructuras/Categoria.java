package mx.utel.poo.estructuras;

public enum Categoria {

    CAT_A(14, 17), CAT_B(18, 24), CAT_C(25, 59), CAT_D(60, 75);

    private int edadMinima, edadMaxima;

    Categoria(int edadMinima, int edadMaxima) {
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
    }

    public boolean clasifica(int edad) {
        return edad >= edadMinima && edad <= edadMaxima;
    }

}
