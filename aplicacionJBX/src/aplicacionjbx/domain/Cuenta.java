/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionjbx.domain;

/**
 *
 * @author lp_02
 */


public class Cuenta {
    
    private String propietario;
    private String Id; 
    private String tipo;

    public Cuenta() {
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String toString(){
    String s="Propietario: "+this.propietario+", Id: "+this.Id+",Tipo:"+this.tipo;
    return s;
    }
}
