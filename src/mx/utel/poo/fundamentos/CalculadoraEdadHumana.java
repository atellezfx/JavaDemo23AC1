package mx.utel.poo.fundamentos;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraEdadHumana {

    public int calcular(Perro p) {
        int edadNatural = p.edad();
        if( edadNatural == 0 ) return edadPerroPorMeses(p);
        if( edadNatural <= 2 ) return 8 * (edadNatural+1);
        return edadPerroPorTalla(p);
    }

    private int edadPerroPorTalla(Perro p) {
        Talla talla = p.getTalla();
        int edadNatural = p.edad();
        return 24 + ( ( edadNatural - 2 ) * talla.getDiferencia() );
    }

    private int edadPerroPorMeses(Perro p) {
        int meses = obtenerMeses(p.getFechaNac());
        if( meses <= 3 ) return meses;
        if( meses <= 5 ) return 6;
        if( meses <= 7 ) return 10;
        if( meses <= 9 ) return 12;
        return 14;
    }

    private int obtenerMeses(LocalDate fechaNac) {
        Period per = Period.between(fechaNac, LocalDate.now());
        return per.getMonths();
    }

}
