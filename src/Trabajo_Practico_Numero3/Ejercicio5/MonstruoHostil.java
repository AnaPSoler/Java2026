package Trabajo_Practico_Numero3.Ejercicio5;

public abstract class MonstruoHostil extends SerVivo {

    public MonstruoHostil(int x, int y, int vida) {
        super(x, y, vida);
    }

    public void atacar() {
        System.out.println("El monstruo ataca al jugador.");
    }
}