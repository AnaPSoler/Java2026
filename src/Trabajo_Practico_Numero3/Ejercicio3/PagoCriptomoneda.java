package Trabajo_Practico_Numero3.Ejercicio3;

public class PagoCriptomoneda implements ProcesablePago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Criptomoneda");
        System.out.println("Verificando wallet y blockchain...");
        System.out.println("Procesando monto: $" + monto);
        System.out.println("Pago confirmado.");
    }
}