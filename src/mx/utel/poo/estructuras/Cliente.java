package mx.utel.poo.estructuras;

import java.time.LocalDate;
import java.time.Period;

public record Cliente(String nombre, LocalDate fechaNac) {

    public int edad() {
        Period per = Period.between(fechaNac, LocalDate.now());
        return per.getYears();
    }

    @Override
    public String toString() {
        String cadena = "Cliente: %s, %d años";
        return cadena.formatted( nombre, edad() );
    }

    public Categoria determinarCategoria() {
        for( Categoria cat : Categoria.values() ) {
            if( cat.clasifica( edad() ) ) return cat;
        }
        return null; // TODO: Explicar porque es peligroso regresar null
    }

}
