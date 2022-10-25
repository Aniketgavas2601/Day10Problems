package com.bridelabz.employeewage;

public class EmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;


    //Refactor the code
    public static int computeEmpWage(String company, int empPerHourRate, int numOfWorkingDays, int maxHourInMonth) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= maxHourInMonth && totalWorkingDays < numOfWorkingDays){
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
        int totalEmpWage = totalEmpHrs * empPerHourRate;
        System.out.println("Total Employee wage for Company: "+company+ "is: "+totalEmpWage);
        return totalEmpWage;
    }

    //Employee Wage For Multiple Companies

    public static void main(String[] args) {
        computeEmpWage("Jio",30,22,12);
        computeEmpWage("Accenture",50,20,9);
        computeEmpWage("NSEIT",60,24,10);
        computeEmpWage("Infosys",45,26,11);
    }
}
