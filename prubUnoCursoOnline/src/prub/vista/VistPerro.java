/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prub.vista;

import prub.controlador.PerroControladorLadrido;

/**
 *
 * @author lp_02
 */
public class VistPerro {

    public VistPerro() {
    }
    public void LadridoMiPerro(){
    PerroControladorLadrido controladorLadrido = new PerroControladorLadrido();
    
    String siLAdraVista= controladorLadrido.procesoControlarLadridoPerro();
    
        System.out.println("mi perro ladra="+siLAdraVista);
    
    }
}
