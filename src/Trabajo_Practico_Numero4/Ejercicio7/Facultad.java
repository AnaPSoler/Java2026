package Trabajo_Practico_Numero4.Ejercicio7;

import java.util.ArrayList;

public class Facultad {

    private String nombre;

    private ArrayList<Carrera> carreras;

    public Facultad(String nombre) {

        this.nombre = nombre;

        carreras = new ArrayList<>();
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }

    public void mostrarFacultad() {

        System.out.println(
                "=== FACULTAD " +
                        nombre.toUpperCase() +
                        " ==="
        );

        for (Carrera carrera : carreras) {
            carrera.mostrarCarrera();
            System.out.println();
        }
    }
}