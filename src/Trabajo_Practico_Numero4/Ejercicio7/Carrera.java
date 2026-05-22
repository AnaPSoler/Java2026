package Trabajo_Practico_Numero4.Ejercicio7;

import java.util.ArrayList;

public class Carrera {

    private String nombre;

    private PlanEstudios plan;

    private ArrayList<Materia> materias;

    public Carrera(
            String nombre,
            PlanEstudios plan
    ) {

        this.nombre = nombre;
        this.plan = plan;

        materias = new ArrayList<>();
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public int calcularCargaTotal() {

        int total = 0;

        for (Materia materia : materias) {
            total += materia.getCargaHoraria();
        }

        return total;
    }

    public void mostrarCarrera() {

        System.out.println(
                "=== CARRERA: " +
                        nombre.toUpperCase() +
                        " ==="
        );

        plan.mostrarPlan();

        System.out.println();
        System.out.println("=== MATERIAS ===");

        for (Materia materia : materias) {
            materia.mostrarMateria();
            System.out.println();
        }

        System.out.println(
                "Carga Horaria Total: " +
                        calcularCargaTotal()
        );
    }
}