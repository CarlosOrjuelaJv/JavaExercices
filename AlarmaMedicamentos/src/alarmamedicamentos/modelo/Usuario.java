/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmamedicamentos.modelo;

/**
 *
 * @author Carlos
 */
public class Usuario {
    private String id;
    private String nombre;
    private String Apellido;
    private String telefono;
    private String eps;
    private BibliotecaMedicamentos bibliotecaMe;

    public Usuario(String id, String nombre, String Apellido, String telefono, String eps) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.telefono = telefono;
        this.eps = eps;
        bibliotecaMe = new BibliotecaMedicamentos(id);
    }

    public BibliotecaMedicamentos getBibliotecaMe() {
        return bibliotecaMe;
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
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the eps
     */
    public String getEps() {
        return eps;
    }

    /**
     * @param eps the eps to set
     */
    public void setEps(String eps) {
        this.eps = eps;
    }
    public void mostrarInfo(){
        System.out.println("id: "+this.id);
        System.out.println("nombre: "+this.nombre);
        System.out.println("apelldio: "+this.Apellido);
        System.out.println("telefono: "+this.telefono);
        System.out.println("eps: "+this.eps);
    }
    
}
