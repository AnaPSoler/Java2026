package Trabajo_Practico_Numero4.Ejercicio7;

public class Docente {

    private String nombre;
    private int horasAsignadas;

    public Docente(String nombre, int horasAsignadas) {
        this.nombre = nombre;
        this.horasAsignadas = horasAsignadas;
    }

    public void mostrarDocente() {

        System.out.println(
                "Docente: " + nombre +
                        " | Horas asignadas: " + horasAsignadas
        );
    }
}