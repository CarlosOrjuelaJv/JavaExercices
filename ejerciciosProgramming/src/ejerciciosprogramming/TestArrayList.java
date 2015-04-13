/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author administrador
 */
public class TestArrayList {
    
    public static void main(String[] args) {
        
        List <Persona> listadoPersonas = new ArrayList<>();
        
        Persona fulanito = new Persona();
        fulanito.setNombres("fulanito");
        fulanito.setApellidos("Perez");
        fulanito.setEdad(21);
        fulanito.setEstatura(1.75F);
        
        Persona pepito = new Persona();
        pepito.setNombres("Pepito");
        pepito.setApellidos("Perez");
        pepito.setEdad(21);
        pepito.setEstatura(1.75F);
        
        Persona juanito = new Persona();
        juanito.setNombres("juanito");
        juanito.setApellidos("Perez");
        juanito.setEdad(21);
        juanito.setEstatura(1.75F);
        
        Persona cesar = new Persona();
        cesar.setNombres("cesar");
        cesar.setApellidos("Palacios");
        cesar.setEdad(40);
        cesar.setEstatura(1.8F);
        
        listadoPersonas.add(fulanito);
        listadoPersonas.add(pepito);
        listadoPersonas.add(juanito);
        listadoPersonas.add(cesar);
        
        System.out.println("Cantidad de elementos adicionados: " + listadoPersonas.size());
        System.out.println("los elementos en el listado son: " + listadoPersonas);
//        listadoPersonas.clear();
        System.out.println("Cantidad de elementos adicionados: " + listadoPersonas.size());
        
        Persona cesarABuscar = new Persona();
        cesarABuscar.setNombres("cesar");
        cesarABuscar.setApellidos("Palacios");
        cesarABuscar.setEdad(40);
        cesarABuscar.setEstatura(1.8F);
        
        Persona fulanitoABuscar = new Persona();
        fulanitoABuscar.setNombres("fulanito");
        fulanitoABuscar.setApellidos("Perez");
        fulanitoABuscar.setEdad(21);
        fulanitoABuscar.setEstatura(1.75F);
        
        List<Persona> personasABuscar = new ArrayList<>();
        personasABuscar.add(cesarABuscar);
        personasABuscar.add(fulanitoABuscar);
        System.out.println("cesar existe en el listado? : " + listadoPersonas.containsAll(personasABuscar));
    }
    
}
