/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.objetos.modelo;

import chat.modelo.Remitente;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import mensajedto.Mensaje;

/**
 *
 * @author admnistrador
 */
public class ClienteMensaje {
    public void enviarmensaje(){
        try {
            mensajedto.Mensaje mensaje= new Mensaje();
            mensaje.setTexto("Hola Mundo a ca Diferente");
            mensaje.setIpOrigen("192.168.0.18");
            mensaje.setIpDestino("192.168.0.54");
            mensaje.setFechaEnvio(new Date());
            
            System.out.println("Enviando...");
            byte[] arregloBytes=mensajedto.Mensaje.marshall(mensaje);
            //establesco comunicacion
            //Socket socket= new Socket(Remitente.IP_DESTINO, Remitente.PUERTO);
           Socket socket= new Socket(Remitente.IP_DESTINO, Remitente.PUERTO);
          //obtengo el outpustream
            OutputStream os= socket.getOutputStream();
            //sabe manejar en memoria los arreglos de bytes, tipos primitivos en java ejmplo int, float etc
           // DataOutputStream dos= new DataOutputStream(os);
            //como ya esta en flujo no toca combertirlo y usamos el flush para enviarlo
            //el metodo write lo mantiene en el flujo
           os.write(arregloBytes);
           //el metodo flush envia el mensaje
           os.flush();
            System.out.println("Enviado.. :)");
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClienteMensaje.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClienteMensaje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
