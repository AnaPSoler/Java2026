package Trabajo_Practico_Numero4.Ejercicio5;

import java.util.ArrayList;

public class HistorialTrofeos {

    private ArrayList<Trofeo> trofeos;

    public HistorialTrofeos() {
        trofeos = new ArrayList<>();
    }

    public void agregarTrofeo(Trofeo trofeo) {
        trofeos.add(trofeo);
    }

    public double calcularPremiosTotales() {

        double total = 0;

        for (Trofeo trofeo : trofeos) {
            total += trofeo.getPremio();
        }

        return total;
    }

    public void mostrarTrofeos() {

        System.out.println("=== HISTORIAL DE TROFEOS ===");

        for (Trofeo trofeo : trofeos) {
            trofeo.mostrarTrofeo();
        }

        System.out.println();
        System.out.println(
                "Premios Totales: $" +
                        calcularPremiosTotales()
        );
    }
}