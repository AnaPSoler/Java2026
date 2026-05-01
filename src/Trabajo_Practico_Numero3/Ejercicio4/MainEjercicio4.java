package Trabajo_Practico_Numero3.Ejercicio4;

public class MainEjercicio4 {

    public static void main(String[] args) {

        Object[] dispositivos = {
                new CamaraSeguridad(),
                new TermostatoInteligente(),
                new Smartphone()
        };

        System.out.println("DISPOSITIVOS QUE PUEDEN CONECTARSE A WIFI:");
        System.out.println();

        for (Object dispositivo : dispositivos) {
            if (dispositivo instanceof ConectableWiFi) {
                ConectableWiFi wifi = (ConectableWiFi) dispositivo;
                wifi.conectarWiFi("Red_Hogar");
            }
        }

        System.out.println();
        System.out.println("DISPOSITIVOS QUE PUEDEN TOMAR FOTOS:");
        System.out.println();

        for (Object dispositivo : dispositivos) {
            if (dispositivo instanceof TomarFoto) {
                TomarFoto camara = (TomarFoto) dispositivo;
                camara.tomarFoto();
            }
        }
    }
}