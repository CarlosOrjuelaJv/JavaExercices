/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ligasfutbol.modelo;

import java.util.ArrayList;

/**
 *
 * @author admnistrador
 */
public class Liga {
    private String id;
    private String nombre;
    private ArrayList<Equipo> equipos;

    public Liga() {
    }

    public Liga(String id, String nombre, ArrayList<Equipo> equipo) {
        this.id = id;
        this.nombre = nombre;
        this.equipos = equipo;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the equipos
     */
    public ArrayList<Equipo> getEquipo() {
        return equipos;
    }

    /**
     * @param equipos the equipos to set
     */
    public void setEquipo(ArrayList<Equipo> equipo) {
        this.equipos = equipo;
    }
    
    
}
