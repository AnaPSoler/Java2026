package Trabajo_Practico_Numero4.Ejercicio5;

public class MainEjercicio5 {

    public static void main(String[] args) {

        Equipo equipo = new Equipo("Inferno Gaming");

        Jugador jugador1 =
                new Jugador(
                        "Shadow",
                        "Sniper",
                        120
                );

        Jugador jugador2 =
                new Jugador(
                        "Blaze",
                        "Support",
                        85
                );

        Jugador jugador3 =
                new Jugador(
                        "Ghost",
                        "Assault",
                        150
                );

        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);

        Trofeo trofeo1 =
                new Trofeo(
                        "Liga LATAM",
                        50000
                );

        Trofeo trofeo2 =
                new Trofeo(
                        "Copa Mundial E-Sports",
                        120000
                );

        equipo.getHistorial().agregarTrofeo(trofeo1);
        equipo.getHistorial().agregarTrofeo(trofeo2);

        equipo.mostrarEquipo();
    }
}