package Trabajo_Practico_Numero2;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito realizado: " + monto);
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero.");
        } else if (monto > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= monto;
            System.out.println("Retiro realizado: " + monto);
        }
    }

    public void verSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo disponible: " + saldo);
    }
}