package mx.utel.poo.hilos;

public class Granero {

    private int cafeAlmacenado;

    // APLICANDO PATRÓN DE DISEÑO SINGLETON #######################
    private static Granero grn;

    private Granero() { }

    public static Granero obtener() {
        if( grn == null ) grn = new Granero(); // Lazy-loading
        return grn;
    }
    // ############################################################

    public synchronized void almacenar(int cantidad) { // Lo ocupa por los objetos Recolector
        cafeAlmacenado += cantidad;
        if( hayCafe() ) notifyAll();
    }

    public synchronized void retirar(int cantidad) throws InterruptedException {
        if( !hayCafe() ) Thread.currentThread().wait(); // Este hilo es el MaestroTostador
        cafeAlmacenado -= cantidad;
    }

    public synchronized boolean hayCafe() {
        return cafeAlmacenado >= 500;
    }

    public synchronized int totalAlmacenado() {
        return cafeAlmacenado;
    }


}
