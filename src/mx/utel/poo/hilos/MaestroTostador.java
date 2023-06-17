package mx.utel.poo.hilos;

public class MaestroTostador extends Empleado {

    private final int GRAMOS_CAFE_TOSTADO = 500;

    public MaestroTostador(String nombre) {
        super(nombre);
    }

    @Override
    protected void trabajar() {
        try {
            Thread.sleep(1000); // Simula que el MaestroTostador inicia 60 minutos después que el Recolector
            System.out.printf("> %s esperando cosecha. \n", getName());
            granero.retirar( GRAMOS_CAFE_TOSTADO );
            Thread.sleep( 1000 ); // Simulando 60 min de trabajo
            System.out.printf("> %s ha tostado %d grs de café \t Granero: %d grs\n",
                getName(), GRAMOS_CAFE_TOSTADO, granero.totalAlmacenado());
        } catch(InterruptedException ex) {
            System.out.println("El trabajo del maestro tostador fue interrumpido");
            ex.printStackTrace();
        }
    }
}
