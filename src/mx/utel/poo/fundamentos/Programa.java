package mx.utel.poo.fundamentos;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Scooby", LocalDate.of(2016, 2, 18), Talla.EXTRA_GRANDE);
        Perro perro2 = new Perro("Milanezo", LocalDate.of(2019, 4, 28), Talla.GRANDE);

        CalculadoraEdadHumana calc = new CalculadoraEdadHumana();
        System.out.printf("%s, que equivale a %d años humanos.\n", perro1, calc.calcular(perro1));
        System.out.printf("%s, que equivale a %d años humanos.\n", perro2, calc.calcular(perro2));
    }

}
