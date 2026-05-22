package Trabajo_Practico_Numero4.Ejercicio1;

import java.util.ArrayList;

public class BilleteraGlobal {

    private ArrayList<Cuenta> cuentas;
    private ArrayList<TarjetaCredito> tarjetas;

    public BilleteraGlobal() {
        cuentas = new ArrayList<>();
        tarjetas = new ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void agregarTarjeta(TarjetaCredito tarjeta) {
        tarjetas.add(tarjeta);
    }

    public double calcularSaldoTotal() {

        double total = 0;

        for (Cuenta cuenta : cuentas) {
            total += cuenta.getSaldo();
        }

        return total;
    }

    public void mostrarBilletera() {

        System.out.println("=== CUENTAS ===");

        for (Cuenta cuenta : cuentas) {
            cuenta.mostrarCuenta();
        }

        System.out.println();
        System.out.println("=== TARJETAS ===");

        for (TarjetaCredito tarjeta : tarjetas) {
            tarjeta.mostrarTarjeta();
        }

        System.out.println();
        System.out.println("Saldo Total: $" + calcularSaldoTotal());
    }
}