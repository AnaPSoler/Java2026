package Trabajo_Practico_Numero3.Ejercicio1;

public class Motocicleta extends Vehiculo {

    private int cilindrada;

    public Motocicleta(String marca, String modelo, double tarifaBase, int cilindrada) {
        super(marca, modelo, tarifaBase);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("MOTOCICLETA:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tarifa: $" + tarifaBase);
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}