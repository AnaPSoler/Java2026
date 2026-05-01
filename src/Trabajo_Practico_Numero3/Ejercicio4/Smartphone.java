package Trabajo_Practico_Numero3.Ejercicio4;

public class Smartphone implements TomarFoto, ConectableWiFi {

    @Override
    public void tomarFoto() {
        System.out.println("Smartphone: tomando fotografía con la cámara.");
    }

    @Override
    public void conectarWiFi(String red) {
        System.out.println("Smartphone conectado a la red WiFi: " + red);
    }
}