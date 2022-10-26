//Multiple Companies Using Interface Approach
package com.bridelabz.employeewage;

public class EmployeeWage {
    public final String company;
    public final int empPerHourRate;
    public static int numOfWorkingDays;
    public static int maxHoursPerMonth;
    public int totalEmpWage;

    public EmployeeWage (String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empPerHourRate = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Employee Wage For Company: "+company+ "is: "+totalEmpWage;
    }
    public static class EmpWageBuilderArray {
        public static final int PART_TIME = 1;
        public static final int FULL_TIME = 2;
        private int numOfCompany = 0;
        private EmployeeWage[] companyEmpWageArray;
        public EmpWageBuilderArray() {
            companyEmpWageArray = new EmployeeWage[5];
        }

        private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
            companyEmpWageArray[numOfCompany] = new EmployeeWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
            numOfCompany++;
        }

        private void computeEmpWage() {
            for (int i = 0; i < numOfCompany; i++) {
                companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
                System.out.println(companyEmpWageArray[i]);
            }
        }

        private int computeEmpWage(EmployeeWage employeeWage){
            //variables
            int empHrs = 0;
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;

            while (totalEmpHrs <= EmployeeWage.maxHoursPerMonth && totalWorkingDays < EmployeeWage.numOfWorkingDays){
                totalWorkingDays++;

                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case PART_TIME:
                        empHrs = 4;
                        break;

                    case FULL_TIME:
                        empHrs = 8;
                        break;

                    default:
                        empHrs = 0;
                }
                totalEmpHrs += empHrs;
                System.out.println("Day: "+totalWorkingDays+ "Emp Hour: " +empHrs);
            }
            return totalEmpHrs * employeeWage.empPerHourRate;
        }

        public static void main(String[] args) {
            EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
            empWageBuilder.addCompanyEmpWage("Jio",45,25,9);
            empWageBuilder.addCompanyEmpWage("Accenture",50,22,10);
            empWageBuilder.computeEmpWage();
        }
    }
}
