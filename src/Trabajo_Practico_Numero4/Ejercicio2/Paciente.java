package Trabajo_Practico_Numero4.Ejercicio2;

public class Paciente {

    private String nombre;
    private int dni;
    private ExpedienteClinico expediente;

    public Paciente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.expediente = new ExpedienteClinico();
    }

    public String getNombre() {
        return nombre;
    }

    public ExpedienteClinico getExpediente() {
        return expediente;
    }

    public void mostrarPaciente() {
        System.out.println("Paciente: " + nombre);
        System.out.println("DNI: " + dni);
    }
}