package mx.utel.poo.hilos;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Programa {

    private ArrayList<Empleado> empleados = new ArrayList<Empleado>(6); // Puede crecer

    public static void main(String[] args) {
        Programa prog = new Programa();
        prog.contratarRecolectores("Juan", "Pedro", "Miguel", "Luis");
        prog.contratarMaestrosTostadores("Oscar", "Lucía");
        prog.iniciarJornadaLaboral();
    }

    private void iniciarJornadaLaboral() {
        // for( Empleado emp : empleados ) emp.start();
        empleados.forEach( Thread::start );
    }

    private void contratarRecolectores(String ... nombres) {
        for( String cad : nombres ) empleados.add(new Recolector(cad));
    }

    private void contratarMaestrosTostadores(String ... nombres) {
        empleados.addAll(
                Stream.of( nombres )
                        .map( MaestroTostador::new )
                        .toList()
        );
    }


}
