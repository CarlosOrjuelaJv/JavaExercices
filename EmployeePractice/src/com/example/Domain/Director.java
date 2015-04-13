/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.Domain;

/**
 *
 * @author lp_02
 */
public class Director extends Manager{
    private double budged;

    public Director(double budged, String deptName, int empId, String name, String ssn, double salary) {
        super(deptName, empId, name, ssn, salary);
        this.budged = budged;
    }

    /**
     * @return the budged
     */
    public double getBudged() {
        return budged;
    }

    /**
     * @param budged the budged to set
     */
    public void setBudged(double budged) {
        this.budged = budged;
    }
    
    
}
