package mx.utel.poo.arreglos;

public class ArreglosIrregulares {

    public static void main(String[] args) {
        ArreglosIrregulares prog = new ArreglosIrregulares();
        String[][] personajes = prog.crearArreglo();
        prog.imprimir( personajes );
    }

    private void imprimir(String[][] personajes) {
        for (int i = 0; i < personajes.length; i++) {
            System.out.printf("### PERSONAJES DE %s\n", familia( i ));
            for (int j = 0; j < personajes[i].length; j++) {
                System.out.println( personajes[i][j] );
            }
        }
    }

    private String familia(int num) {
        return switch (num) {
            case 0 -> "Hanna-Barbera";
            case 1 -> "Disney";
            case 2 -> "Simpsons";
            default -> "Desconocido";
        };
    }

    private String[][] crearArreglo() {
        String[][] personajes = new String[3][];
        final int HANNAB = 0, DISNEY = 1, SIMPSON = 2;

        // PERSONAJES DE HANNA-BARBERA
        personajes[HANNAB] = new String[4];
        personajes[HANNAB][0] = "Benito Bodoque";
        personajes[HANNAB][1] = "Pedro Picapiedra";
        personajes[HANNAB][2] = "Scooby-Doo";
        personajes[HANNAB][3] = "Fantasma del Espacio";

        // PERSONAJES DE DISNEY
        personajes[DISNEY] = new String[8];
        personajes[DISNEY][0] = "Pinocho";
        personajes[DISNEY][1] = "Pancho Pistolas";
        personajes[DISNEY][2] = "Pepe Carioca";
        personajes[DISNEY][3] = "Ariel";
        personajes[DISNEY][4] = "Cenicienta";
        personajes[DISNEY][5] = "Woody";
        personajes[DISNEY][6] = "Mickey Mouse";
        personajes[DISNEY][7] = "Pato Donald";

        // PERSONAJES DE SIMPSONS
        personajes[SIMPSON] = new String[3];
        personajes[SIMPSON][0] = "Gorgori";
        personajes[SIMPSON][1] = "Krusty";
        personajes[SIMPSON][2] = "Homero";

        return personajes;
    }

}
