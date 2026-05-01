package Trabajo_Practico_Numero3.Ejercicio3;

public class PagoTarjetaCredito implements ProcesablePago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Tarjeta de Crédito");
        System.out.println("Validando datos de la tarjeta...");
        System.out.println("Procesando monto: $" + monto);
        System.out.println("Pago aprobado.");
    }
}