package Trabajo_Practico_Numero3.Ejercicio3;

public class MainEjercicio3 {

    public static void main(String[] args) {

        ProcesablePago pago1 = new PagoTarjetaCredito();
        ProcesablePago pago2 = new PagoPayPal();
        ProcesablePago pago3 = new PagoCriptomoneda();

        ProcesablePago[] mediosDePago = { pago1, pago2, pago3 };

        for (ProcesablePago pago : mediosDePago) {
            pago.procesarPago(15000);
            System.out.println();
        }
    }
}