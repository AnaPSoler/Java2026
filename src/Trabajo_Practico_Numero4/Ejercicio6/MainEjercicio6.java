package Trabajo_Practico_Numero4.Ejercicio6;

public class MainEjercicio6 {

    public static void main(String[] args) {

        Serie serie = new Serie("Sombras del Norte");

        Temporada temporada1 = new Temporada(1);

        Episodio episodio1 = new Episodio("El pueblo oculto", 45);
        Episodio episodio2 = new Episodio("La señal perdida", 50);

        Actor actor1 = new Actor("Laura Medina", "Argentina");
        Actor actor2 = new Actor("Diego Torres", "Chile");

        episodio1.agregarActor(actor1);
        episodio1.agregarActor(actor2);

        episodio2.agregarActor(actor1);

        temporada1.agregarEpisodio(episodio1);
        temporada1.agregarEpisodio(episodio2);

        serie.agregarTemporada(temporada1);

        serie.mostrarSerie();
    }
}