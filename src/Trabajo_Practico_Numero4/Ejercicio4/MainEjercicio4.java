package Trabajo_Practico_Numero4.Ejercicio4;

public class MainEjercicio4 {

    public static void main(String[] args) {

        Edificio edificio =
                new Edificio(
                        "WorkSpace Tower",
                        "Buenos Aires"
                );

        Oficina oficina1 =
                new Oficina(101, true);

        Oficina oficina2 =
                new Oficina(202, false);

        Mobiliario escritorio =
                new Mobiliario(
                        "Escritorio Ejecutivo",
                        "Escritorio"
                );

        Mobiliario silla =
                new Mobiliario(
                        "Silla Ergonomica",
                        "Silla"
                );

        Mobiliario monitor =
                new Mobiliario(
                        "Monitor Samsung",
                        "Tecnologia"
                );

        oficina1.agregarMueble(escritorio);
        oficina1.agregarMueble(silla);

        oficina2.agregarMueble(monitor);

        edificio.agregarOficina(oficina1);
        edificio.agregarOficina(oficina2);

        DepositoGeneral deposito =
                new DepositoGeneral();

        deposito.guardarMueble(monitor);

        edificio.listarOficinasDisponibles();

        System.out.println();

        deposito.mostrarDeposito();
    }
}