package Trabajo_Practico_Numero4.Ejercicio1;

public class Movimiento {

    private String descripcion;
    private double monto;

    public Movimiento(String descripcion, double monto) {
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public void mostrarMovimiento() {
        System.out.println(descripcion + " -> $" + monto);
    }
}