/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ligasfutbol.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;//util para ordenar
import java.util.Set;

/**
 *
 * @author admnistrador
 */
public class Equipo implements Comparable<Equipo> {

    private String nombre;
    private String alias;
    private String colorCamisa;
    private String colorPantalon;
    private Set<Jugador> jugadores;//al no inicializarlo el objeto es nulo

    public Equipo() {
    }

    public Equipo(String nombre, String alias, String colorCamisa, String colorPantalon, Set<Jugador> jugador) {
        this.nombre = nombre;
        this.alias = alias;
        this.colorCamisa = colorCamisa;
        this.colorPantalon = colorPantalon;
        this.jugadores = jugador;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return the colorCamisa
     */
    public String getColorCamisa() {
        return colorCamisa;
    }

    /**
     * @param colorCamisa the colorCamisa to set
     */
    public void setColorCamisa(String colorCamisa) {
        this.colorCamisa = colorCamisa;
    }

    /**
     * @return the colorPantalon
     */
    public String getColorPantalon() {
        return colorPantalon;
    }

    /**
     * @param colorPantalon the colorPantalon to set
     */
    public void setColorPantalon(String colorPantalon) {
        this.colorPantalon = colorPantalon;
    }

    /**
     * @return the jugadores se llama el SEt de jugadores y se le puede acceder
     * al metodo add y demas metodos
     */
    public Set<Jugador> getJugador() {
        return jugadores;
    }

    /**
     * @param jugadores the jugadores to set
     */
    public void setJugador(Set<Jugador> jugador) {
        this.jugadores = jugador;
    }

    @Override
    public int compareTo(Equipo o) {
        return (this.nombre.compareTo(o.nombre));
    }

    public String retornarInfo() {

        return this.nombre + ","
                + this.alias + ","
                + this.colorCamisa + ","
                + this.colorPantalon;
    }

    public void obtenerDesdeArchivo(String linea) {
        String[] tokens = linea.split(",");
        this.nombre = tokens[0];
        this.alias = tokens[1];
        this.colorCamisa = tokens[2];
        this.colorPantalon = tokens[3];
    }

    public ArrayList<Jugador> retornaJugadorOrdenado() {
        ArrayList<Jugador> jugadorestemp = new ArrayList<>();
        jugadorestemp.addAll(this.jugadores);
        Collections.sort(jugadorestemp);//utiliza la interfaz compareto de la clase para ordenar
        return jugadorestemp;
    }
}
