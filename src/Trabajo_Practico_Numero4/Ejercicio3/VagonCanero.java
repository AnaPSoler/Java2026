package Trabajo_Practico_Numero4.Ejercicio3;

public class VagonCanero {

    private int numero;
    private double capacidadCarga;

    public VagonCanero(int numero, double capacidadCarga) {
        this.numero = numero;
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void mostrarVagon() {

        System.out.println(
                "Vagon N°" + numero +
                        " | Capacidad: " +
                        capacidadCarga + " toneladas"
        );
    }
}