package com.bridelabz.employeewage;

public class EmployeeWage {
    int FULL_TIME = 1;

    public void empCheckPresentOrAbsent()
    {
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if(empCheck == FULL_TIME){
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }

    public static void main(String[] args) {
        EmployeeWage emp = new EmployeeWage();
        emp.empCheckPresentOrAbsent();
    }
}
