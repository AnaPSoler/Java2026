package Trabajo_Practico_Numero4.Ejercicio1;

public class Usuario {

    private String nombre;
    private BilleteraGlobal billetera;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.billetera = new BilleteraGlobal();
    }

    public String getNombre() {
        return nombre;
    }

    public BilleteraGlobal getBilletera() {
        return billetera;
    }

    public void mostrarUsuario() {
        System.out.println("Usuario: " + nombre);
    }
}