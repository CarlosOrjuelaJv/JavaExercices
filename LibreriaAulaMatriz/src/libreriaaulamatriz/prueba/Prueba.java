/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreriaaulamatriz.prueba;


import java.util.ArrayList;
import libreriaaulamatriz.exeptions.ExepcionNull;

/**
 *
 * @author administrador
 */
public class Prueba {
    
    public static void main(String[] args) {
        
    String[] myString=new String[10];
    
        for (int i = 0; i < (myString.length-4); i++) {
            myString[i]=i+" uino";
        }
        
        try {
            for (String string : myString) {
                System.out.println(volverMayusculas(string));
            }
        
        } catch (ExepcionNull e) {
            System.out.println("Objeto del array es nulo  "+e.getMessage());
        }      

    }
    
    
    
    public static String volverMayusculas(String texto) throws ExepcionNull{
            String temp="";
            
            if (texto==null) {
                throw new ExepcionNull();
            }else{
                temp=texto.toUpperCase();
            }
            
     
        return temp;
    };
    
}
