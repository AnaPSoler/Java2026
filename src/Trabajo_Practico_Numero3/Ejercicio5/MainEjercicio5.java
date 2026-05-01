package Trabajo_Practico_Numero3.Ejercicio5;

public class MainEjercicio5 {

    public static void main(String[] args) {

        EntidadEspacial[] entidades = {
                new GuerreroHumano(10, 20, 100),
                new MagoElfo(30, 40, 80),
                new Orco(50, 60, 120),
                new Dragon(70, 80, 300)
        };

        System.out.println("=== DIBUJAR ENTIDADES ===");
        for (EntidadEspacial entidad : entidades) {
            entidad.dibujar();
        }

        System.out.println();
        System.out.println("=== ACTUALIZAR COORDENADAS ===");
        for (EntidadEspacial entidad : entidades) {
            entidad.mover(100, 200);
        }

        System.out.println();
        System.out.println("=== CALCULAR SUPERVIVENCIA ===");
        for (EntidadEspacial entidad : entidades) {
            if (entidad instanceof SerVivo) {
                SerVivo ser = (SerVivo) entidad;
                ser.recibirDanio(30);
            }
        }

        System.out.println();
        System.out.println("=== LANZAR HECHIZOS ===");
        for (EntidadEspacial entidad : entidades) {
            if (entidad instanceof LanzadorHechizos) {
                LanzadorHechizos magico = (LanzadorHechizos) entidad;
                magico.lanzarHechizo();
            }
        }
    }
}