/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.objetos.modelo;

import chat.modelo.Remitente;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author admnistrador
 */
public class ServidorMensaje {
    public void recibirMensaje(){
        try {
            ServerSocket serverSocket= new ServerSocket(Remitente.PUERTO);
            Socket socket= serverSocket.accept();
            InputStream is= socket.getInputStream();
            //podemos utilizar le read para leer pero se debe decir donde empieza y donde termina de leer
            //se pone que se le entregue parcialmente para evitar las caidas del server la perdida de dato
           //con la clase read si leemos un objeto se lee por partecitas
            //en las commons io hay un metodo que nos devuelve el arreglo de bites desde un flujo
            //sin necesidad de tener que hacer una iteracion
            
            byte[] arregloBytes= IOUtils.toByteArray(is);
            
            
            mensajedto.Mensaje mensajerecibido= mensajedto.Mensaje.unmarshall(arregloBytes);
            mensajerecibido.setFechaRecepcion(new Date());
            System.out.println(mensajerecibido.toString());
        } catch (IOException ex) {
            Logger.getLogger(ServidorMensaje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
