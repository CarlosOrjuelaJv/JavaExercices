/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Domain;

import java.text.NumberFormat;

/**
 *
 * @author lp_02
 */
public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;


    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }
    
    /**
     * @return the empId
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
 

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        if (name != null) {
           this.name = name; 
        }
        
    }

    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * @param ssn the ssn to set
     */

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increse){
        if (increse>0) {
            this.salary+= increse;
        }
    }
    
    @Override
    public String toString(){
    
    return "Employe ID:"+getEmpId()+"\n"+
            "Employe name:"+getName()+"\n"+
            "Employe ssn:"+getSsn()+"\n"+
            "Employe salary:"+NumberFormat.getCurrencyInstance().format(getSalary()) +"\n";
    }

}
