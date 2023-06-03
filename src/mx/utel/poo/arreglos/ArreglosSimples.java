package mx.utel.poo.arreglos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class ArreglosSimples {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        System.out.println("Sistema de captura de empleados");
        ArreglosSimples prog = new ArreglosSimples();
        Empleado[] empleados = prog.crearArreglo();
        prog.imprimirArreglo(empleados);
        prog.input.close();
    }

    private void imprimirArreglo(Empleado[] arreglo) {
        // Ocupando el ciclo For-Each
        // for (Empleado emp : arreglo) System.out.println(emp);
        // Ocupando programación funcional
        Arrays.stream( arreglo ).forEach(System.out::println);
    }

    private Empleado[] crearArreglo() {
        System.out.print("¿Cuántos empleados vas a capturar?: ");
        int capacidad = input.nextInt();
        Empleado[] empleados = new Empleado[capacidad];
        for( int i = 0; i < capacidad; i++ ) {
            System.out.printf("Captura los datos del empleado #%d\n", i+1);
            System.out.print("Escribe el nombre: ");
            String nombre = input.next();
            System.out.print("Escribe la fecha de nacimiento (YYYY-MM-DD): ");
            LocalDate fechaNac = LocalDate.parse( input.next() );
            empleados[i] = new Empleado(nombre, fechaNac);
        }
        return empleados;
    }


}
