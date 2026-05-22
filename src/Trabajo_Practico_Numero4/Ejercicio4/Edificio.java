package Trabajo_Practico_Numero4.Ejercicio4;

import java.util.ArrayList;

public class Edificio {

    private String nombre;
    private String ciudad;

    private ArrayList<Oficina> oficinas;

    public Edificio(String nombre, String ciudad) {

        this.nombre = nombre;
        this.ciudad = ciudad;

        oficinas = new ArrayList<>();
    }

    public void agregarOficina(Oficina oficina) {
        oficinas.add(oficina);
    }

    public void listarOficinasDisponibles() {

        System.out.println(
                "=== OFICINAS DISPONIBLES EN " +
                        nombre.toUpperCase() +
                        " ==="
        );

        for (Oficina oficina : oficinas) {

            if (oficina.isDisponible()) {
                oficina.mostrarOficina();
            }
        }
    }
}