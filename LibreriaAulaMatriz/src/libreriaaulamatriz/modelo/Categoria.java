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
public class Categoria {
private int codigo;
private String abreviatura;
private String nombre;

    public Categoria() {
    }

    public Categoria(int codigo, String abreviatura, String nombre) {
        this.codigo = codigo;
        this.abreviatura = abreviatura;
        this.nombre = nombre;
    }

    public int getCodigo() {
        
        return codigo;
    }

    public void setCodigo(int codigo) {
        //codigo de entrada tiene que ser menor a 40
        if (codigo<40) {
            this.codigo = codigo;
        }else{
            System.out.println("Salio del rango");
        }
        
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        //la abreviatura dad deb ser menor a 4
        if (abreviatura.length()<=3) {
            this.abreviatura = abreviatura;
        }else{
                System.out.println("muy larga");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarInfo(){
        System.out.println("codigo :"+codigo);
        System.out.println("abre :"+abreviatura);
        System.out.println("nombre: "+nombre);
    
    }

}
