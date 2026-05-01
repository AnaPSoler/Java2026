package Trabajo_Practico_Numero3.Ejercicio2;

public class MainEjercicio2 {

    public static void main(String[] args) {

        Suscripcion s1 = new PlanBasico("ana@gmail.com", 101, 5000);
        Suscripcion s2 = new PlanFamiliar("carlos@gmail.com", 102, 5000, 3, 1200);
        Suscripcion s3 = new PlanPremium("maria@gmail.com", 103, 5000, 2500);

        Suscripcion[] suscripciones = { s1, s2, s3 };

        double totalIngresos = 0;

        for (Suscripcion s : suscripciones) {
            s.mostrarDatos();
            System.out.println("Costo mensual: $" + s.calcularCostoMensual());
            System.out.println();

            totalIngresos += s.calcularCostoMensual();
        }

        System.out.println("TOTAL DE INGRESOS MENSUALES: $" + totalIngresos);
    }
}