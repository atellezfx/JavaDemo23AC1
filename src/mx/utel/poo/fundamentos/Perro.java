package mx.utel.poo.fundamentos;

import java.time.LocalDate;
import java.time.Period;

public class Perro {

    private String nombre;
    private LocalDate fechaNac;
    private Talla talla;

    public Perro(String nombre, LocalDate fechaNac, Talla talla) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.talla = talla;
    }

    public int edad() {
        Period per = Period.between(fechaNac, LocalDate.now());
        return per.getYears();
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public Talla getTalla() {
        return talla;
    }

    @Override
    public String toString() {
        String cadena = "%s tiene %d años";
        return cadena.formatted(nombre, edad());
    }
}
