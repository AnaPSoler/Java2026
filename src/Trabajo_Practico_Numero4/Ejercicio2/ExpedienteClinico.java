package Trabajo_Practico_Numero4.Ejercicio2;

import java.util.ArrayList;

public class ExpedienteClinico {

    private ArrayList<EntradaMedica> entradas;

    public ExpedienteClinico() {
        entradas = new ArrayList<>();
    }

    public void agregarEntrada(EntradaMedica entrada) {
        entradas.add(entrada);
    }

    public void generarReporteHistorico() {
        System.out.println("=== REPORTE HISTORICO DEL PACIENTE ===");

        for (EntradaMedica entrada : entradas) {
            entrada.mostrarEntrada();
        }
    }
}