package com.bridelabz.employeewage;

public class EmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_PER_HOUR_RATE = 50;
    public static final int NUMBER_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 20;


    //Refactor the code
    public static int computeEmpWage() {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

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
        return totalEmpWage;
    }


    public static void main(String[] args) {
        computeEmpWage();
    }
}
