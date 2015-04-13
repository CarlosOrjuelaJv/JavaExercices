/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosprogramming;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author administrador
 */
public class TestHashSet {

    public static void main(String[] args) {

        Set<Persona> conjuntoPersonas = new HashSet();

        Persona fulanito = new Persona();
        fulanito.setNombres("fulanito");
        fulanito.setApellidos("Perez");
        fulanito.setEdad(21);
        fulanito.setEstatura(1.75F);

        Persona pepito = new Persona();
        pepito.setNombres("fulanito");
        pepito.setApellidos("Perez");
        pepito.setEdad(21);
        pepito.setEstatura(1.75F);

        Persona juanito = new Persona();
        juanito.setNombres("fulanito");
        juanito.setApellidos("Perez");
        juanito.setEdad(21);
        juanito.setEstatura(1.65F);

        Persona cesar = new Persona();
        cesar.setNombres("cesar");
        cesar.setApellidos("Palacios");
        cesar.setEdad(40);
        cesar.setEstatura(1.8F);

        conjuntoPersonas.add(fulanito);
        conjuntoPersonas.add(juanito);
        conjuntoPersonas.add(pepito);
        conjuntoPersonas.add(cesar);

        System.out.println("la cantidad de personas es: " + conjuntoPersonas.size());
        System.out.println("las personas en el conjunto: " + conjuntoPersonas);
    }

}
