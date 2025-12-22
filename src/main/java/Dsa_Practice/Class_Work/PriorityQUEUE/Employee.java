/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.PriorityQUEUE;

/**
 *
 * @author HAROON TRADERS
 */
public class Employee implements Comparable<Employee>{
 
    private int empID;
    private String empName;
    private int empSalary;
    private int empExp;

    public Employee(int empID, String empName, int empSalary, int empExp) {
        this.empID = empID;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empExp = empExp;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public int getEmpExp() {
        return empExp;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public void setEmpExp(int empExp) {
        this.empExp = empExp;
    }

    @Override
    public String toString() {
        return "[Employee ID: "+empID +
                "   EmployeeName:  "+empName+
                "   Employee Salary:   "+empSalary+
                "   Employee Experience:   "+empExp+
                "] \n";
    }

    @Override
    public int compareTo(Employee o) {
       return this.empID > o.empID ? 1:-1;
    }
    
    
    
}
