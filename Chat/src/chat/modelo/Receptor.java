/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admnistrador
 */
public class Receptor extends Thread{
    public void recibirMensaje(){
        try {
            ServerSocket serverSocket= new ServerSocket(Remitente.PUERTO);
            String linea="";
            do {                
                Socket socket=serverSocket.accept();//devuelve el socket que acepto,con su contenido 
                InputStream is= socket.getInputStream();
                InputStreamReader isr= new InputStreamReader(is);
                BufferedReader br= new BufferedReader(isr);
                linea= br.readLine();
                System.out.println("Recibido: "+linea);
                br.close();
                isr.close();
                is.close();
                socket.close();
            }while(!linea.equals( Remitente.LINEA_FIN_EMISION));
           
            System.out.println("Fin receptor");
            interrupt();
        } catch (IOException ex) {
            Logger.getLogger(Receptor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        recibirMensaje();
    }
    
}
