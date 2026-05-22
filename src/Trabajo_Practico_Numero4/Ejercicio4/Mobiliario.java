package Trabajo_Practico_Numero4.Ejercicio4;

public class Mobiliario {

    private String nombre;
    private String tipo;

    public Mobiliario(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void mostrarMueble() {

        System.out.println(
                "Mueble: " + nombre +
                        " | Tipo: " + tipo
        );
    }
}