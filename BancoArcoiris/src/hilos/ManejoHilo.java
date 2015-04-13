/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Carlos
 */
import java.awt.*;
import java.applet.Applet;
import java.lang.Math;
import java.util.Random;
public class ManejoHilo  extends Thread {
     private String nombre;
    private int retardo;
   
    private double retiro;

    // Constructor para almacenar nuestro nombre
    // y el retardo
    public ManejoHilo( double monto,int d ) {
        retiro=monto;
        retardo = d;
        }

    // El metodo run() es similar al main(), pero para
    // threads. Cuando run() termina el thread muere
    public void run() {
        // Retasamos la ejecución el tiempo especificado

        try {
            sleep( retardo );
        } catch( InterruptedException e ) {
            ;    
        }
        System.out.println( "Retiro=monto :"+retiro+" ,segundos="+retardo );
        }
    
    public String retiros(){
    
            
        return String.valueOf(retiro);
        }
}
