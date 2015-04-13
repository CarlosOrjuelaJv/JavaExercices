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
public class Editorial {
    private String codigo;
    private String abreviatura;
    private String nombre;
    private Autor [] arreAutor=new Autor[4];

    public Editorial() {
    }

    public Editorial(String codigo, String abreviatura, String nombre,Autor[] arreAutor) {
        this.codigo = codigo;
        this.abreviatura = abreviatura;
        this.nombre = nombre;
        this.arreAutor= arreAutor;
    }

    public Autor[] getArreAutor() {
        return arreAutor;
    }

    public void setArreAutor(Autor[] arreAutor) {
        this.arreAutor = arreAutor;
    }
    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        //configuramos entrada de codigo tiene que ser menor a 10
        if (codigo.length()<10) {
           this.codigo = codigo;
        }else{
            System.out.println("id muy grande");
        }
    }

    /**
     * @return the abeviatura
     */
    public String getAbeviatura() {
        return abreviatura;
    }

    /**
     * @param abeviatura the abeviatura to set
     */
    public void setAbeviatura(String abeviatura) {
       //la abreviatura dad deb ser menor a 4
        if (abreviatura.length()<=3) {
            this.abreviatura = abreviatura;
        }else{
                System.out.println("muy larga");
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
        this.nombre = nombre;
    }
    public void mostrarInfo(){
        System.out.println("codigo :"+codigo);
        System.out.println("abre :"+abreviatura);
        System.out.println("nombre :"+nombre);
        //imprimimos el arreglo de autores con todos sus atributos
        for (int i = 0; i < arreAutor.length; i++) {
            System.out.println("Autor num:"+i);
            arreAutor[i].mostrarInfo();
        }
    
    }

}
