package Trabajo_Practico_Numero4.Ejercicio3;

public class Locomotora {

    private String modelo;
    private int potencia;

    public Locomotora(String modelo, int potencia) {
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public void mostrarLocomotora() {

        System.out.println("Locomotora: " + modelo);
        System.out.println("Potencia: " + potencia + " HP");
    }
}