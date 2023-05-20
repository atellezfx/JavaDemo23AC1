package mx.utel.poo.objetos;

public class Programa {

    public static void main(String[] args) {
//        ClaseBateria bat1 = new ClaseBateria(1.2f, 2500, false);
//        System.out.println(bat1);

        Bateria bat1 = new Bateria(1.2f, 5000, true);
        // System.out.println(bat1);

        Foco f1 = new Foco(Modelo.LED, Luz.NEUTRA);

        Linterna l1 = new Linterna("Steren", f1);
        // l1.colocarBateria(bat1);
        System.out.println(l1);

        l1.encender();

    }


}
