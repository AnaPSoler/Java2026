package Trabajo_Practico_Numero3.Ejercicio5;

public class Orco extends MonstruoHostil {

    public Orco(int x, int y, int vida) {
        super(x, y, vida);
    }

    @Override
    public void dibujar() {
        System.out.println("Orco dibujado en pantalla.");
    }
}