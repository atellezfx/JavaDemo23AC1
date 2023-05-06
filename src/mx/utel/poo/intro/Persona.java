package mx.utel.poo.intro;

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad; // La edad debería ser calculada

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String toString() {
        // Evitemos la concatenación, consume mucha memoria
        return "Persona: " + nombre + " " + apellidos + " edad: " + edad + " años.";
    }

}
