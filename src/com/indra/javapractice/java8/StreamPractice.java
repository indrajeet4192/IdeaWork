package com.indra.javapractice.java8;

import com.indra.javapractice.beans.Employee;

import java.util.*;

public class StreamPractice {
    private List <Employee> empList ;
    private Set<Employee> employeeSet;
    private Map<Integer,Employee>employeeMap;

    public StreamPractice(List<Employee> empList, Set<Employee> employeeSet, Map<Integer, Employee> employeeMap) {
        this.empList = empList;
        this.employeeSet = employeeSet;
        this.employeeMap = employeeMap;
    }

    public StreamPractice() {

    }

    @Override
    public String toString() {
        return "StreamPractice{" +
                "empList=" + empList +
                ", employeeSet=" + employeeSet +
                ", employeeMap=" + employeeMap +
                '}';
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public void loadAllCollection() {
        this.empList = loadEmployeeList();
        this.employeeSet = loadEmployeeSet();
        this.employeeMap = loadEmployeeMap();
    }

    private Map<Integer, Employee> loadEmployeeMap() {
        Map<Integer,Employee> employeeMap= new HashMap<>();
        for (int i = 0; i < 10; i++) {
            employeeMap.put(i,new Employee("Indrajeet"+i,i*100,i*10000.00));
        }
        return employeeMap;
    }

    private Set<Employee> loadEmployeeSet() {
        Set <Employee> set = new HashSet();
        for (int i = 0; i < 10; i++) {
            set.add(new Employee("Indrajeet"+i,i*100,i*10000.00));
        }
        return set;
    }

    private List<Employee> loadEmployeeList() {
        ArrayList <Employee> arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(new Employee("Indrajeet"+i,i*100,i*10000.00));
        }
        return arrayList;
    }


}
