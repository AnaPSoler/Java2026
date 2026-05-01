package Trabajo_Practico_Numero3.Ejercicio1;

public abstract class Vehiculo implements Reportable {

    protected String marca;
    protected String modelo;
    protected double tarifaBase;

    public Vehiculo(String marca, String modelo, double tarifaBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
    }
}