package Trabajo_Practico_Numero3.Ejercicio5;

public class Dragon extends MonstruoHostil implements LanzadorHechizos {

    public Dragon(int x, int y, int vida) {
        super(x, y, vida);
    }

    @Override
    public void dibujar() {
        System.out.println("Dragón dibujado en pantalla.");
    }

    @Override
    public void lanzarHechizo() {
        System.out.println("El dragón lanza una llamarada mágica.");
    }
}