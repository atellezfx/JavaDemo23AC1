package mx.utel.poo.objetos;

public class Linterna {

    private String marca;
    private Foco foco;
    private Bateria bateria;

    public Linterna(String marca, Foco foco) {
        this.marca = marca;
        this.foco = foco;
    }

    public void colocarBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        String cadenaOriginal = String.format("Linterna marca %s \n\t● %s", marca, foco);
        if( bateria != null ) return String.format("%s \n\t● %s", cadenaOriginal, bateria);
        return cadenaOriginal;
    }

    public void encender() {
        if( bateria != null ) {
            System.out.printf("Encendiendo linterna con luz %s", foco.luz());
        } else {
            System.out.println("No hay baterías instaladas");
        }
    }


}
