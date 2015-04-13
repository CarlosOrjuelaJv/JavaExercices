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
public class Ebook extends Publicacion implements Publicable{
    private String ISBN;
    private int tamanoBytes;

    public Ebook() {
        
    }

    public Ebook(String ISBN, int tamanoBytes) {
        this.ISBN = ISBN;
        this.tamanoBytes = tamanoBytes;
    }
    
    
    public Ebook(String ISBN, int tamanoBytes,int id, String nombre, String descripcion, Autor autor, Editorial editorial, Categoria categoria) {
        super(id,nombre, descripcion, autor, editorial, categoria);
        this.ISBN = ISBN;
        this.tamanoBytes = tamanoBytes;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setId(String id) {
         if (id.length()<10) {
             this.ISBN = id;
        }else{
            System.out.println("id muy grande");
        }
    }

    public int getTamanoBytes() {
        return tamanoBytes;
    }

    public void setTamanoBytes(int tamanoBytes) {
        this.tamanoBytes = tamanoBytes;
    }

    /**
     *
     */
    @Override
   public void mostrarInfo(){
        System.out.println("ISBN: "+ISBN);
        System.out.println("tamano bites: "+tamanoBytes);
        super.mostrarInfoPublica();
   
   }

    @Override
    public void reservar() {
        super.setReservado(!super.isReservado());
        System.out.println(" LIbro esta reservado: "+super.isReservado());
    }
    

}
