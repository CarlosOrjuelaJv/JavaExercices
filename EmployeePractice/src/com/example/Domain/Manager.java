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
public class Manager extends Employee {

    private String deptName;
    private Employee[] staff;
    private int employeeCount = 0;

    public Manager(String deptName, int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
        this.staff = new Employee[20];
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public int findEmployee(Employee e) {
        int isFind = -1;
        for (int i = 0; i < 20; i++) {
            if (staff[i] != null) {
                if (staff[i].equals(e)) {
                    isFind = i;
                }

            }
        }

        return isFind;
    }

    public boolean addEmployee(Employee e) {
        boolean insert = false;

        if (e != null && employeeCount < 20 && findEmployee(e) == -1) {
            this.staff[employeeCount] = e;
            employeeCount++;
            insert = true;
        }

        return insert;
    }

    public boolean removeEmployee(int id) {
        boolean status = false;
        Employee[] tempArray = new Employee[staff.length];
        int counter = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null) {
                if (staff[i].getEmpId() == id) {
                    status = true;
                    employeeCount--;
                } else {
                    tempArray[counter] = staff[i];
                    counter++;
                }
            }

        }
        for (int i = 0; i < staff.length; i++) {

            staff[i] = tempArray[i];
        }
        return status;
    }

    public void printStaffDetails() {
       // System.out.println("Name Manager:" + this.getName());
        //System.out.println("Numero Empleados :" + this.employeeCount);
        for (Employee employee : staff) {

            if (employee != null) {
                System.out.println(employee.getName());
            }

        }
    }
    @Override
    public String toString(){
        
    return super.toString() +"\n Departament: "+getDeptName();
    }

}
