/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreriaaulamatriz.prueba;

import libreriaaulamatriz.modelo.*;

/**
 *
 * @author CarlosOrjuela
 */
public class prubRevista {

    public static void main(String[] args) {
        
        Autor[] misAutores= new Autor[4];
        
        for (int i = 0; i < misAutores.length; i++) {
            String nombre="juan"+i;
            String id="a34"+i;
            misAutores[i]= new Autor(id, nombre);
        }
        
        Autor myAutor= new Autor("53","pepe");
        Categoria myCategoria= new Categoria(12,"sus","suspenso");
        Editorial myEditoria= new Editorial("A78","Pan","Panamericana",misAutores);
        
    //Revista myEdi= new Revista("a89", "2M", "uno", "asdo", myAutor,myEditoria , myCategoria);
  //  myEdi.mostrarInfo();
            }
}
