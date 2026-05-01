package Trabajo_Practico_Numero3.Ejercicio3;

public class PagoPayPal implements ProcesablePago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal");
        System.out.println("Conectando con cuenta PayPal...");
        System.out.println("Procesando monto: $" + monto);
        System.out.println("Transferencia realizada.");
    }
}