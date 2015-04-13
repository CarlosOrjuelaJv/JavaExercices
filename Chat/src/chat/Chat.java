/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import chat.modelo.Receptor;
import chat.modelo.Remitente;

/**
 *
 * @author admnistrador
 */
public class Chat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Receptor receptor= new Receptor();
        Remitente remitente= new Remitente();
        receptor.start();
       
        remitente.start();
    }
}
