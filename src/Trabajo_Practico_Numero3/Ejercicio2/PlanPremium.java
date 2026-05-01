package Trabajo_Practico_Numero3.Ejercicio2;

public class PlanPremium extends Suscripcion {

    private double cargoExtra;

    public PlanPremium(String correoTitular, int numeroCliente, double costoBase, double cargoExtra) {
        super(correoTitular, numeroCliente, costoBase);
        this.cargoExtra = cargoExtra;
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase + cargoExtra;
    }
}