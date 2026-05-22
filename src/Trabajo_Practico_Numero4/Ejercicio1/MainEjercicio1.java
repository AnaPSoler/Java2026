package Trabajo_Practico_Numero4.Ejercicio1;

public class MainEjercicio1 {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Ana Garcia");

        Cuenta pesos = new Cuenta("Pesos", 150000);
        Cuenta dolares = new Cuenta("Dolares", 2000);
        Cuenta cripto = new Cuenta("Cripto", 500000);

        usuario.getBilletera().agregarCuenta(pesos);
        usuario.getBilletera().agregarCuenta(dolares);
        usuario.getBilletera().agregarCuenta(cripto);

        TarjetaCredito tarjeta1 =
                new TarjetaCredito("1234-5678", "Visa");

        TarjetaCredito tarjeta2 =
                new TarjetaCredito("9876-5432", "Mastercard");

        usuario.getBilletera().agregarTarjeta(tarjeta1);
        usuario.getBilletera().agregarTarjeta(tarjeta2);

        usuario.mostrarUsuario();

        System.out.println();

        usuario.getBilletera().mostrarBilletera();
    }
}