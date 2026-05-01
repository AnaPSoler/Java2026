package Trabajo_Practico_Numero3.Ejercicio5;

public abstract class PersonajeJugable extends SerVivo {

    public PersonajeJugable(int x, int y, int vida) {
        super(x, y, vida);
    }

    public void interactuar() {
        System.out.println("El personaje interactúa con el entorno.");
    }
}