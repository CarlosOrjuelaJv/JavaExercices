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
public abstract class Publicacion  implements  Comparable<Publicacion>{
    private int id;
    private String nombre;
    private String descripcion;
    private Autor autor;
    private Editorial editorial;
    private Categoria categoria;
    private boolean reservado=false;

   
    
     public Publicacion() {
    }

    public Publicacion(int id,String nombre, String descripcion, Autor autor, Editorial editorial, Categoria categoria) {
        this.id= id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
    }
    
     public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
   

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public abstract void mostrarInfo();
    
    
    public  void mostrarInfoPublica(){
        System.out.println("Nombre: "+nombre);
        System.out.println("descrip: "+descripcion);
        autor.mostrarInfo();
        editorial.mostrarInfo();
        categoria.mostrarInfo();
    
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Publicacion o) {
       
       return (this.nombre.compareTo(o.nombre)*-1);
      // return (this.nombre.compareToIgnoreCase(o.nombre)*-1); ignora diferencia entre minusculas y mayusculas
        
    }
}
