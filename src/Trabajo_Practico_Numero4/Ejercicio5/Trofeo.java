package Trabajo_Practico_Numero4.Ejercicio5;

public class Trofeo {

    private String torneo;
    private double premio;

    public Trofeo(String torneo, double premio) {
        this.torneo = torneo;
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }

    public void mostrarTrofeo() {

        System.out.println(
                "Torneo: " + torneo +
                        " | Premio: $" + premio
        );
    }
}