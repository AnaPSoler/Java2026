package Trabajo_Practico_Numero2;

public class Reloj {

    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void mostrar() {
        String horaFormateada = String.format("%02d:%02d:%02d", hora, minuto, segundo);
        System.out.println(horaFormateada);
    }

    public void avanzar() {
        segundo++;

        if (segundo > 59) {
            segundo = 0;
            minuto++;
        }

        if (minuto > 59) {
            minuto = 0;
            hora++;
        }

        if (hora > 23) {
            hora = 0;
        }
    }
}