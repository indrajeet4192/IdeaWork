package com.indra.javapractice.beans;

public class Employee {
    private String empName;
    private  int empId;
    private double empSal;

    public Employee(String empName, int empId, double empSal) {
        this.empName = empName;
        this.empId = empId;
        this.empSal = empSal;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", empSal=" + empSal +
                '}';
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }
}
