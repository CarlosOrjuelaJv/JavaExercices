/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prub.servicio;

import prub.domain.Perro;

/**
 *
 * @author lp_02
 */
public class PerroServicioDeLadrado {
    
    private String perroLadrido;

    public PerroServicioDeLadrado() {
    }

    public String getPerroLadrido(Perro perro) {
        
        if (perro.getTipo().equals("chihuahah")) {
            perroLadrido="yi yi yi";
        }else{
        
        perroLadrido=" no ladras";
        }
        
        return perroLadrido;
    }
    
}
