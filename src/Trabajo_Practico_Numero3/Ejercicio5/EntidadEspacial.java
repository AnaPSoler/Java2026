package Trabajo_Practico_Numero3.Ejercicio5;

public abstract class EntidadEspacial {

    protected int x;
    protected int y;

    public EntidadEspacial(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mover(int nuevoX, int nuevoY) {
        this.x = nuevoX;
        this.y = nuevoY;
        System.out.println("Nueva posición: (" + x + ", " + y + ")");
    }

    public abstract void dibujar();
}