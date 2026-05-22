package Trabajo_Practico_Numero4.Ejercicio7;

public class PlanEstudios {

    private String nombrePlan;

    public PlanEstudios(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public void mostrarPlan() {

        System.out.println(
                "Plan de Estudios: " + nombrePlan
        );
    }
}