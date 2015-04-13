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
public class prubEditorial {
    
    public static void main(String[] args) {
        Autor[] misAutores= new Autor[4];
        for (int i = 0; i < misAutores.length; i++) {
            misAutores[i]= new Autor("a23", "pepe juan");
        }
    Editorial myEdi= new Editorial("a12", "pna", "panamericana",misAutores);
    myEdi.mostrarInfo();
            }
}
