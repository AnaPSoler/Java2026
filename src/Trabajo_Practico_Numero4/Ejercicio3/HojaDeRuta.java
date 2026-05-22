package Trabajo_Practico_Numero4.Ejercicio3;

public class HojaDeRuta {

    private String origen;
    private String destino;

    public HojaDeRuta(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public void mostrarRuta() {

        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
    }
}