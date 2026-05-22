package Trabajo_Practico_Numero4.Ejercicio7;

public class MainEjercicio7 {

    public static void main(String[] args) {

        Facultad facultad =
                new Facultad("Ingenieria");

        Docente docente1 =
                new Docente(
                        "Ing. Tulio Ruesjas",
                        20
                );

        Docente docente2 =
                new Docente(
                        "Lic. Maria Lopez",
                        15
                );

        Materia materia1 =
                new Materia(
                        "Programacion II",
                        120,
                        docente1
                );

        Materia materia2 =
                new Materia(
                        "Estructura de Datos",
                        100,
                        docente2
                );

        PlanEstudios plan =
                new PlanEstudios("Plan 2026");

        Carrera carrera =
                new Carrera(
                        "Ingenieria Informatica",
                        plan
                );

        carrera.agregarMateria(materia1);
        carrera.agregarMateria(materia2);

        facultad.agregarCarrera(carrera);

        facultad.mostrarFacultad();
    }
}