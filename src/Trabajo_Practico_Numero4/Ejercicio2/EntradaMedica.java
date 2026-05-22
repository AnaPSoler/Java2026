package Trabajo_Practico_Numero4.Ejercicio2;

public class EntradaMedica {

    private String fecha;
    private String descripcion;
    private String tipo;

    public EntradaMedica(String fecha, String descripcion, String tipo) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public void mostrarEntrada() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo: " + tipo);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("---------------------------");
    }
}