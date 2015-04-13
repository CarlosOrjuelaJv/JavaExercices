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
public class Revista extends Publicacion implements Publicable {

    private String ISSN;
    private String numPag;

    public Revista() {
    }

    public Revista(String ISSN, String numPag) {
        this.ISSN = ISSN;
        this.numPag = numPag;
    }
    
    public Revista(String ISSN, String numPag,int id, String nombre, String descripcion, Autor autor, Editorial editorial, Categoria categoria) {
        super(id,nombre, descripcion, autor, editorial, categoria);
        this.ISSN = ISSN;
        this.numPag = numPag;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setId(String id) {
        //comprovamos que el id sea menor a 10
        if (id.length() < 10) {
            this.ISSN = id;
        } else {
            System.out.println("id muy grande");
        }
    }

    public String getNumPag() {
        return numPag;
    }

    public void setNumPag(String numPag) {
            //comprovamos que sea un numero el numero de paginas
        try {
            
           
            int num= Integer.getInteger(numPag);
            if (num < 200) {
                this.numPag = numPag;
            }

        } catch (Error e) {
                System.out.println("un numero :"+e);
        }

    }

    /**
     *
     */
    @Override
    public void mostrarInfo() {
        System.out.println("id: " + ISSN);
        System.out.println("num pag: " + numPag);
        super.mostrarInfoPublica();

    }

    @Override
    public void reservar() {
        super.setReservado(!super.isReservado());
        System.out.println(" LIbro esta reservado: "+super.isReservado());
    }

}
