/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ligasfutbol.modelo;

import ligasfutbol.utilidades.PosicionesUtilidad;

/**
 *
 * @author CarlosOrjuela
 */
public class Jugador implements Comparable<Jugador>{
    private String id;
    private String nombre;
    private byte numero;
    private Posicion posicion;

    

    public Jugador() {
    }

    public Jugador(String id, byte numero, String nombre) {
        this.id = id;
        this.numero = numero;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte getNumero() {
        return numero;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public int compareTo(Jugador o) {
        return this.numero-o.numero;
    }
    
    public String retornarInfo(){
    return this.numero+","+
            this.id+","+
            this.posicion.getNombre()+","+
            this.nombre;
    }
     public void obtenerDesdeArchivo(String linea){
        String[] tokens= linea.split(",");
        this.numero=Byte.valueOf(tokens[0]);
        this.id= tokens[1];
        this.posicion= PosicionesUtilidad.getPosiciones().get(tokens[2]);
        this.nombre= tokens[3];
    }
    
    
}
