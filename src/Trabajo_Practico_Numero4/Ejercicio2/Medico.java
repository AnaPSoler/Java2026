package Trabajo_Practico_Numero4.Ejercicio2;

public class Medico {

    private String nombre;
    private String especialidad;

    public Medico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrarMedico() {
        System.out.println("Medico: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }
}