/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prub.controlador;

import prub.domain.Perro;
import prub.servicio.PerroServicioDeLadrado;

/**
 *
 * @author lp_02
 */
public class PerroControladorLadrido {

    public PerroControladorLadrido() {
    }

    public String procesoControlarLadridoPerro() {
        Perro peqePerro = new Perro();
        peqePerro.setTipo("chihuahah");
        peqePerro.setPeso(121);
        PerroServicioDeLadrado servicioLadra = new PerroServicioDeLadrado();
        String siControlaLAdrido = servicioLadra.getPerroLadrido(peqePerro);
        return siControlaLAdrido;
    }

}
