package com.bridelabz.employeewage;

public class EmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    private final String company;
    private final int empPerHourRate;
    private final int numOfWorkingDays;
    private final int maxHourInMonth;
    private int totalEmpWage;

    public EmployeeWage(String company, int empPerHourRate, int numOfWorkingDays, int maxHourInMonth){
        this.company = company;
        this.empPerHourRate = empPerHourRate;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHourInMonth = maxHourInMonth;
    }
    public void computeWage() {
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
        totalEmpWage = totalEmpHrs * empPerHourRate;
    }
    @Override
    public String toString(){
        return "Total Employee Wage For Company: "+company+ "is: "+totalEmpWage;
    }
    //Employee Wage For Multiple Companies

    public static void main(String[] args) {
        EmployeeWage jio = new EmployeeWage("Jio",30,22,12);
        EmployeeWage accenture = new EmployeeWage("Accenture",50,20,9);
        EmployeeWage nseit = new EmployeeWage("NSEIT",60,24,10);
        EmployeeWage infosys = new EmployeeWage("Infosys",45,26,11);
        jio.computeWage();
        System.out.println(jio);
        accenture.computeWage();
        System.out.println(accenture);
        nseit.computeWage();
        System.out.println(nseit);
        infosys.computeWage();
        System.out.println(infosys);
    }
}
