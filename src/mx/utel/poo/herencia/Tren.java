package mx.utel.poo.herencia;

import java.util.ArrayList;
import java.util.Arrays;

public class Tren {

    private Maquina mqn;
    private ArrayList<Vagon> vagones = new ArrayList<Vagon>();

    public Tren(Maquina mqn) {
        this.mqn = mqn;
    }

    public void conectarVagones(Vagon ... args) {
        vagones.addAll(Arrays.asList(args));
    }

    public double volumenTotal() {
        return vagones.stream().mapToDouble( Vagon::volumen ).sum();
    }

    @Override
    public String toString() {
        String cadena = "Tren %s con %d vagones y un volúmen total de %.2f³";
        return cadena.formatted( mqn, vagones.size(), volumenTotal() );
    }
}
