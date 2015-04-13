/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libre.enumeracion;

/**
 *
 * @author administrador
 */
public enum TamanoLibro {
    PEQUENIO(1),MEDIANO(2),GRANDE(3);
    private final int valor;

    private TamanoLibro(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
    
}
