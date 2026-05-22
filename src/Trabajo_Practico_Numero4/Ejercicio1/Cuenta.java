package Trabajo_Practico_Numero4.Ejercicio1;

public class Cuenta {

    private String tipo;
    private double saldo;

    public Cuenta(String tipo, double saldo) {
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {

        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarCuenta() {
        System.out.println("Cuenta: " + tipo + " | Saldo: $" + saldo);
    }
}