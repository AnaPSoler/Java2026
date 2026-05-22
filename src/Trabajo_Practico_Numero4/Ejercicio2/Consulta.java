package Trabajo_Practico_Numero4.Ejercicio2;

public class Consulta {

    private Paciente paciente;
    private Medico medico;
    private String fecha;

    public Consulta(Paciente paciente, Medico medico, String fecha) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
    }

    public void mostrarConsulta() {
        System.out.println("=== CONSULTA MEDICA ===");
        System.out.println("Fecha: " + fecha);
        paciente.mostrarPaciente();
        medico.mostrarMedico();
    }
}