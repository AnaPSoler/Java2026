package Trabajo_Practico_Numero4.Ejercicio3;

public class MainEjercicio3 {

    public static void main(String[] args) {

        Locomotora locomotora =
                new Locomotora("GE Evolution", 4500);

        HojaDeRuta hoja =
                new HojaDeRuta(
                        "Tucuman",
                        "Puerto Rosario"
                );

        TrenAzucarero tren =
                new TrenAzucarero(locomotora, hoja);

        VagonCanero vagon1 =
                new VagonCanero(1, 40);

        VagonCanero vagon2 =
                new VagonCanero(2, 35);

        VagonCanero vagon3 =
                new VagonCanero(3, 50);

        tren.agregarVagon(vagon1);
        tren.agregarVagon(vagon2);
        tren.agregarVagon(vagon3);

        tren.mostrarTren();
    }
}