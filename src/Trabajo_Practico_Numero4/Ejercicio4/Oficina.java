package Trabajo_Practico_Numero4.Ejercicio4;

import java.util.ArrayList;

public class Oficina {

    private int numero;
    private boolean disponible;

    private ArrayList<Mobiliario> muebles;

    public Oficina(int numero, boolean disponible) {

        this.numero = numero;
        this.disponible = disponible;

        muebles = new ArrayList<>();
    }

    public void agregarMueble(Mobiliario mueble) {
        muebles.add(mueble);
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void mostrarOficina() {

        System.out.println(
                "Oficina N°" + numero +
                        " | Disponible: " + disponible
        );

        System.out.println("=== MOBILIARIO ===");

        for (Mobiliario mueble : muebles) {
            mueble.mostrarMueble();
        }

        System.out.println();
    }
}