package Trabajo_Practico_Numero4.Ejercicio2;

public class MainEjercicio2 {

    public static void main(String[] args) {

        Paciente paciente = new Paciente("Ana Garcia", 39230259);

        Medico medico = new Medico("Dr. Raul Fernandez", "Cardiologia");

        Consulta consulta = new Consulta(paciente, medico, "22/05/2026");

        EntradaMedica entrada1 = new EntradaMedica(
                "22/05/2026",
                "Paciente presenta dolor de pecho leve. Se indica control.",
                "Diagnostico"
        );

        EntradaMedica entrada2 = new EntradaMedica(
                "23/05/2026",
                "Se receta medicacion preventiva y seguimiento semanal.",
                "Receta"
        );

        paciente.getExpediente().agregarEntrada(entrada1);
        paciente.getExpediente().agregarEntrada(entrada2);

        consulta.mostrarConsulta();

        System.out.println();

        paciente.getExpediente().generarReporteHistorico();
    }
}