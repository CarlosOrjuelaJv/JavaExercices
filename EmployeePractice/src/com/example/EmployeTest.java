/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example;

/**
 *
 * @author lp_02
 */
import com.example.Domain.Admin;
import com.example.Domain.Director;
import com.example.Domain.Employee;
import com.example.Domain.Engineer;
import com.example.Domain.Manager;
import com.example.business.EmployeeStockPlan;
import java.text.NumberFormat;
public class EmployeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeStockPlan stockPlan = new EmployeeStockPlan();
        // TODO code application logic here
        Employee empIn1= new Engineer(101,"Jane Smith","012-34-5678",120_345.27);
        Employee empIn2= new Engineer(102,"Mae Smu","012-67-56778",124_345.27);
        Employee empIn3= new Engineer(103,"Mia Sed","012-34-8678",123_345.27);
        Employee emp2 = new Manager("US_Marketing", 207, "Barbara Johnson", "054-12-2367", 109_501.36);
        Employee emp3 = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        Manager emp4 = new Director(1_000_000.00, "Global Marketing", 12, "Susan Wheeler", "099-45-2340", 120_567.36);
        
        emp4.setName("Papel Uno");
        emp4.raiseSalary(1_000);
       /* System.out.println(" se agrego 1 :"+((Manager)emp2).addEmployee(empIn1));
        System.out.println(" se agrego 2 :"+((Manager)emp2).addEmployee(empIn2));
        System.out.println(" se agrego 3 :"+((Manager)emp2).addEmployee(empIn3));*/
       
       ((Manager)emp2).printStaffDetails();
        
       // System.out.println(((Manager)emp2).findEmployee(empIn3));
        
       // System.out.println(((Manager)emp2).removeEmployee(101));;
        
        ((Manager)emp2).printStaffDetails();
        printEmployee(emp4,stockPlan);
    }
    private static void printEmployee( Employee e){
       // if (e instanceof Director) {
        System.out.println("Employee type: "+e.getClass().getSimpleName());
            System.out.println(e);   
        //}  
    }
    private static void printEmployee(Employee e,EmployeeStockPlan StockPlan){
        printEmployee(e);
        System.out.println("Stock option: "+StockPlan.grantStock(e));
    
    }
}
