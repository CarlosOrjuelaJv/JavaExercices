/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreriaaulamatriz.prueba;
import LibreriaAulaMatriz.comparadores.CompararPublicacionId;
import libreriaaulamatriz.modelo.*;
/**
 *
 * @author CarlosOrjuela
 */
public class pruPublica {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Autor[] misAutores= new Autor[4];
        
        for (int i = 0; i < misAutores.length; i++) {
            String nombre="juan"+i;
            String id="a34"+i;
            misAutores[i]= new Autor(id, nombre);
        }
        
        Autor myAutor= new Autor("53","pepe");
        Categoria myCategoria= new Categoria(12,"sus","suspenso");
        Editorial myEditoria= new Editorial("A78","Pan","Panamericana",misAutores);
        
        Publicacion myPublica= new Libro("A24",50,1,"los pollo","cuento pollo",myAutor,myEditoria,myCategoria);
        Publicacion myPublica2= new Ebook();
        myPublica2.setNombre("A24");
        myPublica.setNombre("a23");
        System.out.println(myPublica.compareTo(myPublica2));
        //myPublica.mostrarInfo();
        //((Libro)myPublica).reservar();
        CompararPublicacionId comp1= new CompararPublicacionId();
      //  System.out.println(comp1.compare(myPublica, myPublica2));
                
    }

}
