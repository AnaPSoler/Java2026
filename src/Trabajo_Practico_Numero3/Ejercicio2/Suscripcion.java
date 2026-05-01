package Trabajo_Practico_Numero3.Ejercicio2;

public abstract class Suscripcion implements Facturable {

    protected String correoTitular;
    protected int numeroCliente;
    protected double costoBase;

    public Suscripcion(String correoTitular, int numeroCliente, double costoBase) {
        this.correoTitular = correoTitular;
        this.numeroCliente = numeroCliente;
        this.costoBase = costoBase;
    }

    public void mostrarDatos() {
        System.out.println("Correo: " + correoTitular);
        System.out.println("Número de cliente: " + numeroCliente);
        System.out.println("Costo base: $" + costoBase);
    }
}