/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmamedicamentos.modelo;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class BibliotecaMedicamentos {

    private String id;
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();

    public BibliotecaMedicamentos(String id) {
        this.id = id;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the medicamentos
     */
    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    /**
     * @param medicamentos the medicamentos to set
     */
    public void agragarMedicamento(Medicamento medicame) {
        this.medicamentos.add(medicame);
    }

    public void activarAlarma(String id) {
        if (medicamentos.size() > 0) {
            for (Medicamento medicamento : medicamentos) {
                if (medicamento.getId().equals(id)) {
                    medicamento.setIsActivo(true);
                    System.out.println("Activada alarma " + medicamento.getNombre());
                } else {
                    System.out.println("Medicamento no encontrado");
                }
            }
        } else {
            System.out.println("no tiene medicamentos");
        }

    }

    ;
    public void desactivaAlarma(String id) {
        if (medicamentos.size() > 0) {
            for (Medicamento medicamento : medicamentos) {
                if (medicamento.getId().equals(id)) {
                    medicamento.setIsActivo(false);
                    System.out.println("desactivada alarma " + medicamento.getNombre());
                } else {
                    System.out.println("Medicamento no encontrado");
                }
            }
        } else {
            System.out.println("no tiene medicamentos");
        }

    }

    ;
    
    public Medicamento modificarMedicamento(String id) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getId().equals(id)) {
                return medicamento;
            }
        }
        return null;
    }

    ;
    
    public void buscarMedicamentoNombre(String nombre) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getId().equals(nombre)) {
                System.out.println(medicamento.toString() + " ");
            }
        }

    }

    ;
    
    public void buscarMedicamentoId(String id) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getId().equals(id)) {
                System.out.println(medicamento.toString() + " ");
            }
        }

    }

    ;
    
    public void mostrarMedicamentos() {
        System.out.println("medicamentos");
        if (medicamentos.size() != 0) {
            for (Medicamento medicamento : medicamentos) {
                System.out.println("nombre medicamento: " + medicamento.getNombre());
                System.out.println("id: " + medicamento.getId());
            }
        } else {
            System.out.println("no tiene medicamentos guardados");
        }

    }
;
}
