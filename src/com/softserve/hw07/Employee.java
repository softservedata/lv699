package com.softserve.hw07;

public class Employee implements Payment{
    private String employeeId;
    private String Name;

     public Employee() {
        Name="";
        employeeId="";

    }
       public Employee(String employeeId, String Name) {
           this.employeeId=employeeId;
            this.Name = Name;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", Name='" + Name + '\''+", ";
    }

    @Override
    public int calculatePay() {
        return 0;
    }
}
