package Trabajo_Practico_Numero4.Ejercicio1;

public class TarjetaCredito {

    private String numero;
    private String banco;

    public TarjetaCredito(String numero, String banco) {
        this.numero = numero;
        this.banco = banco;
    }

    public void mostrarTarjeta() {
        System.out.println("Tarjeta: " + banco + " | Número: " + numero);
    }
}