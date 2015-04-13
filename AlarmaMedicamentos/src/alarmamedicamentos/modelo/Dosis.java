/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmamedicamentos.modelo;

import java.util.Date;

/**
 *
 * @author Carlos
 */
public class Dosis {
    private String id;
    private int cantidad;
    private int intervaloHora;
    private int timepoConsumoDias;
    private int intervaloDias;
    private String[] dias;
    private int cantidadPorDOsis;
    public static final String[] DIAS_SEMANA= {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
    

    public Dosis(String id, int cantidad, int intervaloHora, int timepoConsumo, String[] dias, int cantidadPorDOsis) {

        this.id = id;
        this.cantidad = cantidad;
        this.intervaloHora = intervaloHora;
        this.timepoConsumoDias = timepoConsumo;
        this.intervaloDias = intervaloDias;
        this.dias = dias;
        this.cantidadPorDOsis = cantidadPorDOsis;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the intervaloHora
     */
    public int getIntervaloHora() {
        return intervaloHora;
    }

    /**
     * @param intervaloHora the intervaloHora to set
     */
    public void setIntervaloHora(int intervaloHora) {
        this.intervaloHora = intervaloHora;
    }

    /**
     * @return the timepoConsumo
     */
    public int getTimepoConsumo() {
        return timepoConsumoDias;
    }

    /**
     * @param timepoConsumo the timepoConsumo to set
     */
    public void setTimepoConsumo(int timepoConsumo) {
        this.timepoConsumoDias = timepoConsumo;
    }

    /**
     * @return the intervaloDias
     */
    public int getIntervaloDias() {
        return intervaloDias;
    }

    /**
     * @param intervaloDias the intervaloDias to set
     */
    public void setIntervaloDias(int intervaloDias) {
        this.intervaloDias = intervaloDias;
    }

    /**
     * @return the dias
     */
    public String[] getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(String[] dias) {
        this.dias = dias;
    }

    /**
     * @return the cantidadPorDOsis
     */
    public int getCantidadPorDOsis() {
        return cantidadPorDOsis;
    }

    /**
     * @param cantidadPorDOsis the cantidadPorDOsis to set
     */
    public void setCantidadPorDOsis(int cantidadPorDOsis) {
        this.cantidadPorDOsis = cantidadPorDOsis;
    }
    
    
}
