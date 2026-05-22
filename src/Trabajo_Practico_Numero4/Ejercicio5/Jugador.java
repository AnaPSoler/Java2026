package Trabajo_Practico_Numero4.Ejercicio5;

public class Jugador {

    private String nickname;
    private String rol;
    private int kills;

    public Jugador(String nickname, String rol, int kills) {
        this.nickname = nickname;
        this.rol = rol;
        this.kills = kills;
    }

    public void mostrarJugador() {

        System.out.println(
                "Jugador: " + nickname +
                        " | Rol: " + rol +
                        " | Kills: " + kills
        );
    }
}