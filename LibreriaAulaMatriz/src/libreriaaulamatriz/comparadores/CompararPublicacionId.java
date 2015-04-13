/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LibreriaAulaMatriz.comparadores;

import java.util.Comparator;
import libreriaaulamatriz.modelo.Publicacion;

/**
 *
 * @author admnistrador
 */
public class CompararPublicacionId implements Comparator<Publicacion>{

    @Override
    public int compare(Publicacion o1, Publicacion o2) {
          if (o1.getId() == o2.getId()) {
            return 0;
        }
        if (o1.getId() < o2.getId()) {
            return -1;
        }
        if (o1.getId() > o2.getId()) {
            return 1;
        }
        return 0;
    }
    
}
