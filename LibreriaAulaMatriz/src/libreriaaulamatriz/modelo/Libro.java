/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreriaaulamatriz.modelo;

import libre.enumeracion.TamanoLibro;

/**
 *
 * @author CarlosOrjuela
 */
public class Libro extends Publicacion implements Publicable{
    private String ISBM;
    private int numPag;
    private TamanoLibro tamanioLibro;

    public TamanoLibro getTamanioLibro() {
        return tamanioLibro;
    }

    public void setTamanioLibro(TamanoLibro tamanioLibro) {
        this.tamanioLibro = tamanioLibro;
    }

    public Libro() {
       
    }

    public Libro(String ISBM, int numPag) {
        this.ISBM = ISBM;
        this.numPag = numPag;
    }
    
    public Libro(String ISBM, int numPag, int id, String nombre, String descripcion, Autor autor, Editorial editorial, Categoria categoria) {
        super(id, nombre, descripcion, autor, editorial, categoria);
        this.ISBM = ISBM;
        this.numPag = numPag;
    }

    public String getISBM() {
        return ISBM;
    }

    public void setId(String id) {
        if (id.length()<10) {
             this.ISBM = id;
        }else{
            System.out.println("id muy grande");
        }
       
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        if (numPag<2000) {
            this.numPag = numPag;
        }
        
    }

    @Override
    public void mostrarInfo(){
        System.out.println("id :"+ISBM);
        System.out.println("num Paginas :"+numPag);
        //imprimimos mostrar info de publicacion
        super.mostrarInfoPublica();
   
   }

    @Override
    public void reservar() {
        super.setReservado(!this.isReservado());
         System.out.println(" LIbro esta reservado: "+this.isReservado());
      //  super.setReservado(!super.isReservado());
        //System.out.println(" LIbro esta reservado: "+this.isReservado());
    }
}
