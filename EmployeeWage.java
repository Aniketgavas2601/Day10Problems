package com.bridelabz.employeewage;

public class EmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_PER_HOUR_RATE = 50;
    int empHrs = 0;
    int empWage = 0;


    //Check Employee IS present Or Absent
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
        System.out.println("Employee Wage:"+empWage);
    }



    //Add Part Time And EmployeeWage

    public void addPartTimeAndEmpWage(){
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if(empCheck == FULL_TIME)
            empHrs = 8;
        else if(empCheck == PART_TIME)
            empHrs = 4;
        else
            empHrs = 0;
        empWage = empHrs * EMP_PER_HOUR_RATE;
        System.out.println("Employee Wage: "+empWage);
    }

    //Using Switch Case
    public void switchStatement(){
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        switch (empCheck){
            case FULL_TIME:
                empHrs = 8;
                break;
            case PART_TIME:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }
        empWage = empHrs * EMP_PER_HOUR_RATE;
        System.out.println("Employee Wage: "+empWage);
    }

    public static void main(String[] args) {
        EmployeeWage emp = new EmployeeWage();
        emp.empCheckPresentOrAbsent();
        emp.empDailyWage();
        emp.addPartTimeAndEmpWage();
        emp.switchStatement();
    }
}
