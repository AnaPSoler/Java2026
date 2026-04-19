package Trabajo_Practico_Numero2;

public class Empleado {

    private static int cantidad = 0;

    private int legajo;
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        cantidad++;
        this.legajo = cantidad;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void aumentarPorcentaje(double porcentaje) {
        if (porcentaje > 0) {
            sueldo += sueldo * porcentaje / 100;
        }
    }

    public void aumentarMonto(double monto) {
        if (monto > 0) {
            sueldo += monto;
        }
    }

    public void mostrar() {
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
    }

    public static int getCantidad() {
        return cantidad;
    }
}