package mx.utel.poo.estructuras;

public class Credito {

    private double monto;
    private double interes;

    public Credito(double monto, double interes) {
        this.monto = monto;
        this.interes = interes;
    }

    @Override
    public String toString() {
        int tasa = (int) (interes * 100);
        String cadena = "Crédito autorizado por $%,.2f con una tasa del %d%%";
        return cadena.formatted( monto, tasa);
    }
}
