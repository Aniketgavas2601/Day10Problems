package com.bridelabz.employeewage;

public class EmployeeWage {
    int FULL_TIME = 1;
    int EMP_PER_HOUR_RATE = 50;
    int empHrs = 0;
    int empWage = 0;

    public void empCheckPresentOrAbsent() {
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }


    //Calculate Daily EmployeeWage
    public void empDailyWage() {
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if(empCheck == FULL_TIME){
            empHrs = 8;
        }else{
            empHrs = 0;
        }
        empWage = empHrs * EMP_PER_HOUR_RATE;
        System.out.println("Daily EmployeeWage:"+empWage);
    }


    public static void main(String[] args) {
        EmployeeWage emp = new EmployeeWage();
        emp.empCheckPresentOrAbsent();
        emp.empDailyWage();
    }
}
