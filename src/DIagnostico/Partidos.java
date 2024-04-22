package DIagnostico;

import java.util.LinkedList;

public interface Partidos {
    //Metodos
    public void juegarPartidos(LinkedList<Equipos> equipos);
    public void mostrarResultados(LinkedList<Equipos> equipos);
    public void mostrarGanador(LinkedList<Equipos> equipos);

}
