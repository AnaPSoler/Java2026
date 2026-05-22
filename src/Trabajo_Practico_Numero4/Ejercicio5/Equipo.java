package Trabajo_Practico_Numero4.Ejercicio5;

import java.util.ArrayList;

public class Equipo {

    private String nombre;

    private ArrayList<Jugador> jugadores;

    private HistorialTrofeos historial;

    public Equipo(String nombre) {

        this.nombre = nombre;

        jugadores = new ArrayList<>();

        historial = new HistorialTrofeos();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public HistorialTrofeos getHistorial() {
        return historial;
    }

    public void mostrarEquipo() {

        System.out.println(
                "=== EQUIPO " +
                        nombre.toUpperCase() +
                        " ==="
        );

        System.out.println();
        System.out.println("=== JUGADORES ===");

        for (Jugador jugador : jugadores) {
            jugador.mostrarJugador();
        }

        System.out.println();

        historial.mostrarTrofeos();
    }
}