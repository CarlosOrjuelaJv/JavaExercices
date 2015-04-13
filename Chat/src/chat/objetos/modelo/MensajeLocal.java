/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.objetos.modelo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.rmi.server.UID;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CarlosOrjuela
 */
//todo aquel que este involucrado en la calse de envio deben ser serializables
//o no se puede enviar.
public class MensajeLocal implements Serializable{
    private String ipOrigen;
    private String ipDestino;
    private String texto;
    private Date fehaReception;
    private Date fehaEnvio;
   
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public MensajeLocal() {
    }
    
    public MensajeLocal(String ipOrigen, String ipDestino, String texto, Date fehaReception, Date fehaEnvio) {
        this.ipOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        this.texto = texto;
        this.fehaReception = fehaReception;
        this.fehaEnvio = fehaEnvio;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    /**
     * @return the ipOrigen
     */
    public String getIpOrigen() {
        return ipOrigen;
    }
    
    /**
     * @param ipOrigen the ipOrigen to set
     */
    public void setIpOrigen(String ipOrigen) {
        this.ipOrigen = ipOrigen;
    }
    
    /**
     * @return the ipDestino
     */
    public String getIpDestino() {
        return ipDestino;
    }
    
    /**
     * @param ipDestino the ipDestino to set
     */
    public void setIpDestino(String ipDestino) {
        this.ipDestino = ipDestino;
    }
    
    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }
    
    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    /**
     * @return the fehaReception
     */
    public Date getFehaReception() {
        return fehaReception;
    }
    
    /**
     * @param fehaReception the fehaReception to set
     */
    public void setFehaReception(Date fehaReception) {
        this.fehaReception = fehaReception;
    }
    
    /**
     * @return the fehaEnvio
     */
    public Date getFehaEnvio() {
        return fehaEnvio;
    }
    
    /**
     * @param fehaEnvio the fehaEnvio to set
     */
    public void setFehaEnvio(Date fehaEnvio) {
        this.fehaEnvio = fehaEnvio;
    }
    //</editor-fold>
    
    public static byte[] marshall(MensajeLocal mensaje){
        
        ObjectOutputStream oos= null;
        try {
            ByteArrayOutputStream baos= new ByteArrayOutputStream();
            oos= new ObjectOutputStream(baos);
            oos.writeObject(mensaje);
            byte[] arregloRetorno = baos.toByteArray();// me retorna la representacion en bytes del objeto
            oos.close();
            baos.close();
            return arregloRetorno;
        } catch (IOException ex) {
            Logger.getLogger(MensajeLocal.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                oos.close();
            } catch (Exception e) {
                System.out.println("Error"+e);
            }
        
        
        }
        return null;
    }
    public static MensajeLocal unmarshall( byte[] arregloBytes){
        ObjectInputStream ois= null;
        try {
            ByteArrayInputStream bais= new ByteArrayInputStream(arregloBytes);
            ois = new ObjectInputStream(bais);
            MensajeLocal mensaje= (MensajeLocal)ois.readObject();
            ois.close();
            return mensaje;
           
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MensajeLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(MensajeLocal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    @Override
    public String toString(){
       return "ipOrigen: "+this.getIpOrigen()+"--\n"+
               "ipDestino: "+this.getIpDestino()+"--\n"
               +"texto: "+this.texto+"--\n"+
               "fechaEnvio:"+this.getFehaEnvio()+"--\n"+
               "fechaRecepcion"+this.getFehaReception();
    }
}
