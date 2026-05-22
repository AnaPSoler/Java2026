package Trabajo_Practico_Numero4.Ejercicio4;

import java.util.ArrayList;

public class DepositoGeneral {

    private ArrayList<Mobiliario> mueblesGuardados;

    public DepositoGeneral() {
        mueblesGuardados = new ArrayList<>();
    }

    public void guardarMueble(Mobiliario mueble) {
        mueblesGuardados.add(mueble);
    }

    public void mostrarDeposito() {

        System.out.println("=== DEPOSITO GENERAL ===");

        for (Mobiliario mueble : mueblesGuardados) {
            mueble.mostrarMueble();
        }
    }
}