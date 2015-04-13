/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmamedicamentos.modelo;

/**
 *
 * @author Carlos
 */
public class Medicamento {
    private String id;
    private String nombre;
    private String prescripcion;
    private Dosis dosis;
    private String precauciones;
    private Marca marca;
    private boolean isActivo;
    private String imagen;
    private TipoMedicamento tipoMedicamento;

    public Medicamento(String id, String nombre, String prescripcion, Dosis dosis, String precauciones, Marca marca, boolean isActivo, String imagen, TipoMedicamento tipoMedicamento) {
        this.id = id;
        this.nombre = nombre;
        this.prescripcion = prescripcion;
        this.dosis = dosis;
        this.precauciones = precauciones;
        this.marca = marca;
        this.isActivo = isActivo;
        this.imagen = imagen;
        this.tipoMedicamento = tipoMedicamento;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * @return the prescripcion
     */
    public String getPrescripcion() {
        return prescripcion;
    }

    /**
     * @param prescripcion the prescripcion to set
     */
    public void setPrescripcion(String prescripcion) {
        this.prescripcion = prescripcion;
    }

    /**
     * @return the dosis
     */
    public Dosis getDosis() {
        return dosis;
    }

    /**
     * @param dosis the dosis to set
     */
    public void setDosis(Dosis dosis) {
        this.dosis = dosis;
    }

    /**
     * @return the precauciones
     */
    public String getPrecauciones() {
        return precauciones;
    }

    /**
     * @param precauciones the precauciones to set
     */
    public void setPrecauciones(String precauciones) {
        this.precauciones = precauciones;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the isActivo
     */
    public boolean isIsActivo() {
        return isActivo;
    }

    /**
     * @param isActivo the isActivo to set
     */
    public void setIsActivo(boolean isActivo) {
        this.isActivo = isActivo;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the tipoMedicamento
     */
    public TipoMedicamento getTipoMedicamento() {
        return tipoMedicamento;
    }

    /**
     * @param tipoMedicamento the tipoMedicamento to set
     */
    public void setTipoMedicamento(TipoMedicamento tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }
    
    
    
}
