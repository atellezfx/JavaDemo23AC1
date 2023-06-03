package mx.utel.poo.arreglos;

import java.time.LocalDate;
import java.time.Period;

public record Empleado(String nombre, LocalDate fechaNac) {

    public int edad() {
        Period per = Period.between(fechaNac, LocalDate.now());
        return per.getYears();
    }

    @Override
    public String toString() {
        String cadena = "Empleado %s tiene %d años";
        return cadena.formatted(nombre, edad());
    }
}
