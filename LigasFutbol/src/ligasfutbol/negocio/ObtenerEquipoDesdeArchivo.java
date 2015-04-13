/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ligasfutbol.negocio;

import java.io.BufferedReader;//leer lo que hay en el archivo
import java.io.FileNotFoundException;
import java.io.FileReader;//lee el archivo del disco duro
import java.io.IOException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import ligasfutbol.modelo.Equipo;
import ligasfutbol.modelo.Jugador;

/**
 *
 * @author admnistrador
 */
public class ObtenerEquipoDesdeArchivo {

    public static void main(String args[]) {
        try {//acedemos al archivo
            FileReader fileReader = new FileReader("Nacional.liga");
            //leer el archivo
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            Equipo equipo= new Equipo();

            String cadena = "";
            int lineas = 0;
            equipo.setJugador(new HashSet<Jugador>());//inicializa la lista de jugadores del equipo
            //lee la linea mientras la linea no sea vacia y guarda la lineavacia en la variable cadena
            while ((cadena = bufferedReader.readLine()) != null) {
                if (lineas == 0) {
                    //leer el equipo
                    equipo.obtenerDesdeArchivo(cadena);
                } else {
                    //lee jugador
                    Jugador jugador= new Jugador();
                    jugador.obtenerDesdeArchivo(cadena);
                    equipo.getJugador().add(jugador);
                }
                lineas++;
            }
            
            System.out.println(equipo.retornarInfo());
            for(Jugador jugador:equipo.retornaJugadorOrdenado()){
                System.out.println(jugador.retornarInfo());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObtenerEquipoDesdeArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ObtenerEquipoDesdeArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
