package Trabajo_Practico_Numero3.Ejercicio2;

public class PlanBasico extends Suscripcion {

    public PlanBasico(String correoTitular, int numeroCliente, double costoBase) {
        super(correoTitular, numeroCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase;
    }
}