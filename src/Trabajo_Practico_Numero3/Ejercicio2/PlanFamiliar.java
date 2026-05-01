package Trabajo_Practico_Numero3.Ejercicio2;

public class PlanFamiliar extends Suscripcion {

    private int perfilesAdicionales;
    private double recargoPorPerfil;

    public PlanFamiliar(String correoTitular, int numeroCliente, double costoBase,
                        int perfilesAdicionales, double recargoPorPerfil) {
        super(correoTitular, numeroCliente, costoBase);
        this.perfilesAdicionales = perfilesAdicionales;
        this.recargoPorPerfil = recargoPorPerfil;
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase + (perfilesAdicionales * recargoPorPerfil);
    }
}