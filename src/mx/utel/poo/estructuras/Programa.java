package mx.utel.poo.estructuras;

import java.time.LocalDate;
import java.util.Scanner;

public class Programa {

    private Scanner scn = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Programa prog = new Programa();
        Banco bnk = new Banco("BBVA");
        prog.procesarSolicitud( bnk );
    }

    private void procesarSolicitud( Banco bnk ) {
        System.out.println("=========== SOLICITUD DE CRÉDITO ===========");
        System.out.print("Ingrese el monto: ");
        double monto = scn.nextDouble();
        Cliente cli = crearCliente();
        Credito cred = bnk.solicitarCredito(cli, monto);
        if( cred != null ) System.out.println(cred);
        else System.out.println("Crédito no autorizado!!");
    }

    private Cliente crearCliente() {
        System.out.print("Ingrese su nombre completo: ");
        String nombre = scn.next();
        System.out.print("Ingrese su fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNac = LocalDate.parse( scn.next() );
        return new Cliente(nombre, fechaNac);
    }

}