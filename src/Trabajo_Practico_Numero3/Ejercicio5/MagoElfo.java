package Trabajo_Practico_Numero3.Ejercicio5;

public class MagoElfo extends PersonajeJugable implements LanzadorHechizos {

    public MagoElfo(int x, int y, int vida) {
        super(x, y, vida);
    }

    @Override
    public void dibujar() {
        System.out.println("Mago Elfo dibujado en pantalla.");
    }

    @Override
    public void lanzarHechizo() {
        System.out.println("Mago Elfo lanza un poderoso hechizo.");
    }
}