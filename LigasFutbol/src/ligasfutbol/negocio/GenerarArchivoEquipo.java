/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ligasfutbol.negocio;

import java.io.FileWriter;//puede acceder la memoria del disco duro
import java.io.IOException;
import java.io.PrintWriter;//puede moodificar un archivo
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import ligasfutbol.modelo.Equipo;
import ligasfutbol.modelo.Jugador;
import ligasfutbol.utilidades.PosicionesUtilidad;

/**
 *
 * @author CarlosOrjuela
 */
public class GenerarArchivoEquipo {
    public static void main(String args[]){
        //inicializando el objeto equipo 
        Equipo equipo= new Equipo();
        equipo.setNombre("Nacional");
        equipo.setAlias("Verdo");
        equipo.setColorCamisa("Verde");
        equipo.setColorPantalon("Blanco");
        
        //inicializando jugador
        Jugador jugador1= new Jugador();
        jugador1.setId("1001");
        jugador1.setNombre("Pablo");
        jugador1.setNumero((byte)9);
        jugador1.setPosicion(PosicionesUtilidad.MEDIOCAMPISTA);
        
        //inicializando jugador
        Jugador jugador2= new Jugador();
        jugador2.setId("1002");
        jugador2.setNombre("Ronaldo");
        jugador2.setNumero((byte)10);
        jugador2.setPosicion(PosicionesUtilidad.MEDIOCAMPISTA);
        
        //inicializando jugador
        Jugador jugador3= new Jugador();
        jugador3.setId("1003");
        jugador3.setNombre("falcao");
        jugador3.setNumero((byte)1);
        jugador3.setPosicion(PosicionesUtilidad.PORTERO);
        
        //inicializando jugador
        Jugador jugador4= new Jugador();
        jugador4.setId("1004");
        jugador4.setNombre("Messi");
        jugador4.setNumero((byte)4);
        jugador4.setPosicion(PosicionesUtilidad.DEFENSA);
        
        //inicializando jugador
        Jugador jugador5= new Jugador();
        jugador5.setId("1005");
        jugador5.setNombre("Pinto");
        jugador5.setNumero((byte)11);
        jugador5.setPosicion(PosicionesUtilidad.DELANTERO);
        //inicializar la coleccion
        equipo.setJugador(new HashSet<Jugador>());
        //agregar jugadores al Set del equipo
        equipo.getJugador().add(jugador1);
        equipo.getJugador().add(jugador2);
        equipo.getJugador().add(jugador3);
        equipo.getJugador().add(jugador4);
        equipo.getJugador().add(jugador5);
        jugador3.setNombre("Pepito");
        equipo.getJugador().add(jugador3);
        
        
        System.out.println(equipo.getJugador().size());
        //System.out.println(equipo.getJugador().iterator().);
        try {
            
            FileWriter fileWriter = new FileWriter(equipo.getNombre()+".liga");
            PrintWriter printWriter= new PrintWriter(fileWriter);
            
            printWriter.println(equipo.retornarInfo());
            for(Jugador jugador: equipo.getJugador()){
               printWriter.println(jugador.retornarInfo()); 
            
            }
            
            //metodo flush que es lo que lleva en memoria llevelo al archivo, no cierra el archivo
            //metodo close finalize el envio y cierre el archivo
            printWriter.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(GenerarArchivoEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
