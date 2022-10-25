package com.bridelabz.employeewage;

public class EmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_PER_HOUR_RATE = 50;
    public static final int NUMBER_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 20;
    int empHrs = 0;
    int empWage = 0;
    int totalEmpWage = 0;
    int totalEmpHrs = 0;
    int totalWorkingDays = 0;


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

    //Calculate Employee Monthly Wage

    public void empMonthlyWage(){
        for(int day=0; day < NUMBER_OF_WORKING_DAYS; day++){
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
            totalEmpWage += empWage;
            System.out.println("Employee Wage: "+empWage);
        }
        System.out.println("Total Employee Wage: "+totalEmpWage);
    }

    //Calculating Wages till Number of Working Days or Total Working Hours per month is Reached

    public void wagesTillTotalWorkingHoursPerMonth(){
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUMBER_OF_WORKING_DAYS){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
            totalEmpHrs += empHrs;
            System.out.println("Day: "+totalWorkingDays+ "Employee Hour: "+empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_PER_HOUR_RATE;
        System.out.println("Total Employee wage: "+totalEmpWage);
    }

    public static void main(String[] args) {
        EmployeeWage emp = new EmployeeWage();
        emp.empCheckPresentOrAbsent();
        emp.empDailyWage();
        emp.addPartTimeAndEmpWage();
        emp.switchStatement();
        emp.empMonthlyWage();
        emp.wagesTillTotalWorkingHoursPerMonth();
    }
}
