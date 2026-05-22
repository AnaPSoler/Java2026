package Trabajo_Practico_Numero4.Ejercicio3;

import java.util.ArrayList;

public class TrenAzucarero {

    private Locomotora locomotora;
    private HojaDeRuta hojaDeRuta;

    private ArrayList<VagonCanero> vagones;

    public TrenAzucarero(
            Locomotora locomotora,
            HojaDeRuta hojaDeRuta
    ) {

        this.locomotora = locomotora;
        this.hojaDeRuta = hojaDeRuta;

        vagones = new ArrayList<>();
    }

    public void agregarVagon(VagonCanero vagon) {
        vagones.add(vagon);
    }

    public double calcularCargaTotal() {

        double total = 0;

        for (VagonCanero vagon : vagones) {
            total += vagon.getCapacidadCarga();
        }

        return total;
    }

    public void mostrarTren() {

        System.out.println("=== TREN AZUCARERO ===");

        locomotora.mostrarLocomotora();

        System.out.println();

        hojaDeRuta.mostrarRuta();

        System.out.println();
        System.out.println("=== VAGONES ===");

        for (VagonCanero vagon : vagones) {
            vagon.mostrarVagon();
        }

        System.out.println();
        System.out.println(
                "Carga Total: " +
                        calcularCargaTotal() +
                        " toneladas"
        );
    }
}