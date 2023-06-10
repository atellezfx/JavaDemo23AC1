package mx.utel.poo.herencia;

public class Programa {

    public static void main(String[] args) {
        VagonCisterna vs1 = new VagonCisterna("Diesel");
//        System.out.println(vs1);

        VagonCerrado vc1 = new VagonCerrado("Grava");
//        System.out.println(vc1);

        VagonAutorack va1 = new VagonAutorack("Audi A8 x 15u");
//        System.out.println(va1);

        Maquina mqn = new Maquina("El Olivo");
        Tren t1 = new Tren(mqn);
        t1.conectarVagones( vs1, vc1, va1 );
        System.out.println(t1);
        System.out.printf(">> %s\n", vs1);
        System.out.printf(">> %s\n", vc1);
        System.out.printf(">> %s\n", va1);
    }

}
