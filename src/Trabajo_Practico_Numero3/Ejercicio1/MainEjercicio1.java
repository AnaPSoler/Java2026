package Trabajo_Practico_Numero3.Ejercicio1;

public class MainEjercicio1 {

    public static void main(String[] args) {

        Vehiculo v1 = new Furgoneta("Ford", "Transit", 10000, 1200);
        Vehiculo v2 = new Motocicleta("Honda", "XR150", 5000, 150);

        Vehiculo[] flota = { v1, v2 };

        for (Vehiculo v : flota) {
            v.mostrarInfo();
            System.out.println();
        }
    }
}