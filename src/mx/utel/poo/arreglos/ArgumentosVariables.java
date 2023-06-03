package mx.utel.poo.arreglos;

import java.util.Arrays;

public class ArgumentosVariables {

    public static void main(String[] args) {
        ArgumentosVariables prog = new ArgumentosVariables();
//      // prog.imprimir();
        // prog.imprimir("María José");
        prog.imprimir("María José", "Christian", "Erick", "Fernando", "Julio", "Marco", "Nicolás", "Oscar");
    }

    private void imprimir(String ... nombres) {
        System.out.println("Imprimiendo lista de nombres");
        // for (String n : nombres) System.out.println(n);
        Arrays.stream( nombres )
                .filter( n -> n.contains("a") )
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

}
