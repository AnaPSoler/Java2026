package Trabajo_Practico_Numero4.Ejercicio6;

import java.util.ArrayList;

public class Temporada {

    private int numero;
    private ArrayList<Episodio> episodios;

    public Temporada(int numero) {
        this.numero = numero;
        episodios = new ArrayList<>();
    }

    public void agregarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }

    public int calcularDuracionTemporada() {
        int total = 0;

        for (Episodio episodio : episodios) {
            total += episodio.getDuracionMinutos();
        }

        return total;
    }

    public void mostrarTemporada() {
        System.out.println("=== TEMPORADA " + numero + " ===");

        for (Episodio episodio : episodios) {
            episodio.mostrarEpisodio();
            System.out.println();
        }
    }
}