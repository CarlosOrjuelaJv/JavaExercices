/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admnistrador
 */
public class Remitente  extends Thread{
    
    public static final String LINEA_FIN_EMISION="-1"; 
    public static final String IP_DESTINO="192.168.1.168"; 
    public static final int PUERTO=50000; 
    public void enviarMensaje(){
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        
        String linea="";
        while (linea!=LINEA_FIN_EMISION) { //por cada linea que enviamos generamos un socket           
            try {
                linea= br.readLine();
                Socket socket = new Socket(IP_DESTINO, PUERTO);
                OutputStream os= socket.getOutputStream();
                OutputStreamWriter osw= new OutputStreamWriter(os);
                BufferedWriter bw= new BufferedWriter(osw);
                
                bw.write(linea);
                bw.close();
                osw.close();
                os.close();
                socket.close();
                
            } catch (IOException ex) {
                linea=LINEA_FIN_EMISION;
            }
        }
        System.out.println("Fin de la emision");
        this.interrupt();
    }

    @Override
    public void run() {
       enviarMensaje();
       
    }
}
