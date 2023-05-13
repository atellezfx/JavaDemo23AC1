package mx.utel.poo.fundamentos;

public class ProgramaCortoCircuito {

    public static void main(String[] args) {
        ProgramaCortoCircuito prog = new ProgramaCortoCircuito();
        if( prog.esVerdadero() || prog.esFalso() ) {
            System.out.println("El resultado final es verdadero del OR");
        }

        if( prog.esFalso() && prog.esVerdadero() ) {
            System.out.println("El resultado final es verdadero del AND");
        }

    }

    private boolean esVerdadero() {
        System.out.println("Este método regresa verdadero");
        return true;
    }

    private boolean esFalso() {
        System.out.println("Este método regresa falso");
        return false;
    }


}
