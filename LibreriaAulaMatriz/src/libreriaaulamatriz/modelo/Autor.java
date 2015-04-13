/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreriaaulamatriz.modelo;

/**
 *
 * @author CarlosOrjuela
 */
public class Autor {
    private String numeroId;
    private String nombre;

    public Autor() {
    }

    public Autor(String numeroId, String nombre) {
        this.numeroId = numeroId;
        this.nombre = nombre;
    }

    /**
     * @return the numeroId
     */
    public String getNumeroId() {
        return numeroId;
    }

    /**
     * @param numeroId the numeroId to set
     */
    public void setNumeroId(String numeroId) {
        //configuramos entrada de id tiene que ser menor a 10
        if (numeroId.length()<10) {
           this.numeroId = numeroId; 
        }else{
            System.out.println("id muy grande");
        }
        
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
        //conmbre entrante tiene que tener espacio minimos 2 nombres
        if (!nombre.contains(" ")) {
           this.nombre = nombre; 
        }else{
            System.out.println("Ingrese nobre y apellido");
        }
        
    }
    public void mostrarInfo(){
        System.out.println("id:"+numeroId);
        System.out.println("nombre:"+nombre);
    
    }
    

}
