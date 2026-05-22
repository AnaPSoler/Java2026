package Trabajo_Practico_Numero4.Ejercicio6;

public class Actor {

    private String nombre;
    private String nacionalidad;

    public Actor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarActor() {
        System.out.println("Actor: " + nombre + " | Nacionalidad: " + nacionalidad);
    }
}