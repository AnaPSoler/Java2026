package Trabajo_Practico_Numero4.Ejercicio6;

import java.util.ArrayList;

public class Episodio {

    private String titulo;
    private int duracionMinutos;
    private ArrayList<Actor> actores;

    public Episodio(String titulo, int duracionMinutos) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        actores = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void mostrarEpisodio() {
        System.out.println("Episodio: " + titulo + " | Duracion: " + duracionMinutos + " minutos");

        System.out.println("Actores asociados:");

        for (Actor actor : actores) {
            actor.mostrarActor();
        }
    }
}