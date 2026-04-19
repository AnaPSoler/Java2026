package Trabajo_Practico_Numero1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println(" TRABAJO PRACTICO N°1 - PROGRAMACION II");
        System.out.println("=======================================\n");

        ejercicio1(entrada);
        ejercicio2(entrada);
        ejercicio3(entrada);
        ejercicio4(entrada);
        ejercicio5(entrada);
        ejercicio6(entrada);

        entrada.close();
    }

    // 1) Nota de una materia
    public static void ejercicio1(Scanner entrada) {
        System.out.println("----- EJERCICIO 1 -----");
        System.out.print("Ingrese la nota del alumno: ");
        int nota = entrada.nextInt();

        if (nota == 10) {
            System.out.println("El alumno aprobo y su calificacion es sobresaliente.");
        } else if (nota >= 4) {
            System.out.println("El alumno aprobo la materia.");
        } else {
            System.out.println("El alumno desaprobo la materia.");
        }

        System.out.println();
    }

    // 2) Promedio de tres parciales
    public static void ejercicio2(Scanner entrada) {
        System.out.println("----- EJERCICIO 2 -----");
        System.out.print("Ingrese la nota del primer parcial: ");
        double parcial1 = entrada.nextDouble();

        System.out.print("Ingrese la nota del segundo parcial: ");
        double parcial2 = entrada.nextDouble();

        System.out.print("Ingrese la nota del tercer parcial: ");
        double parcial3 = entrada.nextDouble();

        double promedio = (parcial1 + parcial2 + parcial3) / 3;

        System.out.println("Promedio obtenido: " + promedio);

        if (promedio >= 8) {
            System.out.println("El alumno esta promocionado.");
        } else {
            System.out.println("El alumno no esta promocionado.");
        }

        System.out.println();
    }

    // 3) Numero de uno o dos digitos
    public static void ejercicio3(Scanner entrada) {
        System.out.println("----- EJERCICIO 3 -----");
        System.out.print("Ingrese un numero positivo entre 1 y 99: ");
        int numero = entrada.nextInt();

        if (numero >= 1 && numero <= 9) {
            System.out.println("El numero ingresado tiene un digito.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El numero ingresado tiene dos digitos.");
        } else {
            System.out.println("El numero ingresado esta fuera del rango solicitado.");
        }

        System.out.println();
    }

    // 4) Fecha y trimestre
    public static void ejercicio4(Scanner entrada) {
        System.out.println("----- EJERCICIO 4 -----");
        System.out.print("Ingrese el dia: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese el anio: ");
        int anio = entrada.nextInt();

        if (mes >= 1 && mes <= 3) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " pertenece al primer trimestre.");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " pertenece al segundo trimestre.");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " pertenece al tercer trimestre.");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " pertenece al cuarto trimestre.");
        } else {
            System.out.println("El mes ingresado no es valido.");
        }

        System.out.println();
    }

    // 5) Cuadrante de un punto
    public static void ejercicio5(Scanner entrada) {
        System.out.println("----- EJERCICIO 5 -----");
        System.out.print("Ingrese el valor de x: ");
        int x = entrada.nextInt();

        System.out.print("Ingrese el valor de y: ");
        int y = entrada.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("El punto se encuentra en el primer cuadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto se encuentra en el segundo cuadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto se encuentra en el tercer cuadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("El punto se encuentra en el cuarto cuadrante.");
        } else {
            System.out.println("El punto no pertenece a ningun cuadrante porque uno de los valores es cero.");
        }

        System.out.println();
    }

    // 6) Triangulos
    public static void ejercicio6(Scanner entrada) {
        System.out.println("----- EJERCICIO 6 -----");
        System.out.print("Ingrese la cantidad de triangulos a analizar: ");
        int cantidad = entrada.nextInt();

        int equilateros = 0;
        int isosceles = 0;
        int escalenos = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("\nTriangulo " + i);

            System.out.print("Ingrese lado 1: ");
            int lado1 = entrada.nextInt();

            System.out.print("Ingrese lado 2: ");
            int lado2 = entrada.nextInt();

            System.out.print("Ingrese lado 3: ");
            int lado3 = entrada.nextInt();

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triangulo equilatero.");
                equilateros++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triangulo isosceles.");
                isosceles++;
            } else {
                System.out.println("Es un triangulo escaleno.");
                escalenos++;
            }
        }

        System.out.println("\nCantidad de triangulos equilateros: " + equilateros);
        System.out.println("Cantidad de triangulos isosceles: " + isosceles);
        System.out.println("Cantidad de triangulos escalenos: " + escalenos);

        if (equilateros < isosceles && equilateros < escalenos) {
            System.out.println("El tipo de triangulo con menor cantidad es el equilatero.");
        } else if (isosceles < equilateros && isosceles < escalenos) {
            System.out.println("El tipo de triangulo con menor cantidad es el isosceles.");
        } else if (escalenos < equilateros && escalenos < isosceles) {
            System.out.println("El tipo de triangulo con menor cantidad es el escaleno.");
        } else {
            System.out.println("No hay un unico tipo de triangulo con menor cantidad.");
        }

        System.out.println();
    }
}
