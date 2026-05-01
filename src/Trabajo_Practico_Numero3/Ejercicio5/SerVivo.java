package Trabajo_Practico_Numero3.Ejercicio5;

public abstract class SerVivo extends EntidadEspacial {

    protected int vida;

    public SerVivo(int x, int y, int vida) {
        super(x, y);
        this.vida = vida;
    }

    public void recibirDanio(int danio) {
        vida -= danio;
        System.out.println("Recibió daño: -" + danio + " HP");

        if (vida <= 0) {
            System.out.println("El ser ha muerto.");
        } else {
            System.out.println("Vida restante: " + vida);
        }
    }
}