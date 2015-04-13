/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ligasfutbol.utilidades;

import java.util.HashMap;
import java.util.Map;
import ligasfutbol.modelo.Posicion;

/**
 *
 * @author CarlosOrjuela
 */
public final class PosicionesUtilidad {
    //clase final para que ninguna la herede
    //lo hacemos estatico para acceder directamente a el y solo crear una instancia
    //ya que no vamos de igual manera a tener diferentes tipos de Porteros, o defensas, etc
    public final static  Posicion PORTERO = new Posicion(1, "Portero");
    public final static  Posicion DEFENSA = new Posicion(2, "Defensa");
    public final static  Posicion MEDIOCAMPISTA = new Posicion(3, "MedioCampista");
    public final static  Posicion DELANTERO = new Posicion(4, "Delantero");
   
    //privado para que nadie modifica el map
    private static Map<String,Posicion> POSCICIONES;
    // le entrega el estring y ya devuelbe el objeto poscicione
    //metodo debe ser estatico para no referenciar la clase
    public static Map<String,Posicion> getPosiciones(){
        POSCICIONES= new HashMap<String, Posicion>();
        
        POSCICIONES.put(PORTERO.getNombre(), PORTERO);
        POSCICIONES.put(DEFENSA.getNombre(), DEFENSA);
        POSCICIONES.put(MEDIOCAMPISTA.getNombre(), MEDIOCAMPISTA);
        POSCICIONES.put(DELANTERO.getNombre(), DELANTERO);
        return POSCICIONES;
    }
    
}
