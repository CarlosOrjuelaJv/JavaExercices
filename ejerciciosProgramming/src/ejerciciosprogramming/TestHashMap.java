/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author administrador
 */
public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer,Persona> mapaPersona = new HashMap();
        
        Persona fulanito = new Persona();
        fulanito.setNombres("fulanito1");
        fulanito.setApellidos("Perez");
        fulanito.setEdad(21);
        fulanito.setEstatura(1.75F);

        Persona pepito = new Persona();
        pepito.setNombres("fulanito2");
        pepito.setApellidos("Perez");
        pepito.setEdad(21);
        pepito.setEstatura(1.75F);

        Persona juanito = new Persona();
        juanito.setNombres("fulanito3");
        juanito.setApellidos("Perez");
        juanito.setEdad(21);
        juanito.setEstatura(1.65F);

        Persona cesar = new Persona();
        cesar.setNombres("cesar");
        cesar.setApellidos("Palacios");
        cesar.setEdad(40);
        cesar.setEstatura(1.8F);

        mapaPersona.put(1,fulanito);
        mapaPersona.put(2,pepito);
        mapaPersona.put(3,juanito);
        mapaPersona.put(4,cesar);
        
        System.out.println("la cantidad de personas es: " + mapaPersona.size());
        System.out.println("las personas en el mapa es : " + mapaPersona);
    }
    
}
