package Trabajo_Practico_Numero2;

public class Main {
    public static void main(String[] args) {

        System.out.println("************ TP N°2 - POO ************");
        System.out.println();

        // CALCULADORA
        Calculadora calc = new Calculadora();
        System.out.println("CALCULADORA:");
        System.out.println("5 + 3 = " + calc.sumar(5, 3));
        System.out.println("10 - 4 = " + calc.restar(10, 4));
        System.out.println();

        // RELOJ
        System.out.println("RELOJ:");
        Reloj reloj = new Reloj(23, 59, 58);
        reloj.mostrar();
        reloj.avanzar();
        reloj.avanzar();
        reloj.mostrar();
        System.out.println();

        // CUENTA
        System.out.println("CUENTA BANCARIA:");
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 500);
        cuenta.depositar(300);
        cuenta.retirar(200);
        cuenta.verSaldo();
        System.out.println();

        // LIBRO
        System.out.println("LIBRO:");
        Libro libro = new Libro("1984", "Orwell");
        libro.mostrar();
        libro.prestar();
        libro.mostrar();
        System.out.println();

        // EMPLEADO
        System.out.println("EMPLEADOS:");
        Empleado e1 = new Empleado("Ana", 800);
        e1.aumentarPorcentaje(20);
        e1.mostrar();

        System.out.println("Total empleados: " + Empleado.getCantidad());
    }
}