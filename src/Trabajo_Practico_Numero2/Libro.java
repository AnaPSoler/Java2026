package Trabajo_Practico_Numero2;

public class Libro {

    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public void prestar() {
        if (prestado) {
            System.out.println("El libro ya esta prestado.");
        } else {
            prestado = true;
            System.out.println("El libro fue prestado.");
        }
    }

    public void devolver() {
        if (!prestado) {
            System.out.println("El libro ya estaba disponible.");
        } else {
            prestado = false;
            System.out.println("El libro fue devuelto.");
        }
    }

    public void mostrar() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Estado: " + (prestado ? "Prestado" : "Disponible"));
    }
}