package mx.utel.poo.estructuras;

import java.util.Scanner;

public class Cadenas {

    public static void main(String[] args) {
        Cadenas prog = new Cadenas();
        Scanner scn = new Scanner(System.in);
        System.out.print("Escribe un texto: ");
        String texto = scn.nextLine();
        System.out.print("Escribe una letra: ");
        char letra = scn.nextLine().charAt(0);
        int conteo = prog.contarCoincidencias(texto, letra);
        System.out.printf("Veches que aparece la letra '%s': %d", letra, conteo);
    }

    private int contarCoincidencias(String texto, char letra) {
        // ##### Programación imperativa #########################

        // Ocupando ciclo for tradicional
//        char[] caracteres = texto.toCharArray();
//        int cantidad = 0;
//        for (int i = 0; i < caracteres.length; i++) {
//            if( letra == caracteres[i] ) cantidad++;
//        }
//        return cantidad;

        // Ocupando ciclo for-each
//        for( char c : caracteres ) if( letra == c ) cantidad++;
//        return cantidad;

        // ##### Programación declarativa (funcional) #############
        return (int) texto.chars().filter( c -> c == letra ).count();
    }


}
