/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.business;

import com.example.Domain.Director;
import com.example.Domain.Employee;
import com.example.Domain.Manager;

/**
 *
 * @author lp_02
 */
public class EmployeeStockPlan {
    
    public int grantStock(Employee emp){
        int num=0;
        if (emp instanceof Director) {
            num=1000;
        }else if (emp instanceof Manager) {
            num=100;
        }else  if (emp instanceof Employee) {
            num=10;
        }
        
    return num;
    }
}
