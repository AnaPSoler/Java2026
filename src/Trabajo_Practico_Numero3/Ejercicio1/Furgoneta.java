package Trabajo_Practico_Numero3.Ejercicio1;

public class Furgoneta extends Vehiculo {

    private double capacidadCarga;

    public Furgoneta(String marca, String modelo, double tarifaBase, double capacidadCarga) {
        super(marca, modelo, tarifaBase);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("FURGONETA:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tarifa: $" + tarifaBase);
        System.out.println("Capacidad de carga: " + capacidadCarga + " kg");
    }
}