/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ligasfutbol.modelo;

/**
 *
 * @author CarlosOrjuela
 */
public class Posicion {

       private int id;
       private String nombre; 

    public Posicion() {
    }

    public Posicion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
       
    
}