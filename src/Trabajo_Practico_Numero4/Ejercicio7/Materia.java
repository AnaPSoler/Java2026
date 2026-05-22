package Trabajo_Practico_Numero4.Ejercicio7;

public class Materia {

    private String nombre;
    private int cargaHoraria;
    private Docente docente;

    public Materia(
            String nombre,
            int cargaHoraria,
            Docente docente
    ) {

        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
        this.docente = docente;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void mostrarMateria() {

        System.out.println(
                "Materia: " + nombre +
                        " | Carga Horaria: " + cargaHoraria
        );

        docente.mostrarDocente();
    }
}