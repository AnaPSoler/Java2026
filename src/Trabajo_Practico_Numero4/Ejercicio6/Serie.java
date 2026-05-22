package Trabajo_Practico_Numero4.Ejercicio6;

import java.util.ArrayList;

public class Serie {

    private String titulo;
    private ArrayList<Temporada> temporadas;

    public Serie(String titulo) {
        this.titulo = titulo;
        temporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public int calcularDuracionTotal() {
        int total = 0;

        for (Temporada temporada : temporadas) {
            total += temporada.calcularDuracionTemporada();
        }

        return total;
    }

    public void mostrarSerie() {
        System.out.println("=== SERIE: " + titulo.toUpperCase() + " ===");

        for (Temporada temporada : temporadas) {
            temporada.mostrarTemporada();
        }

        System.out.println("Duracion total de la serie: " + calcularDuracionTotal() + " minutos");
    }
}