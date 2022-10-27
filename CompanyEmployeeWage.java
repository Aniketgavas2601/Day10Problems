package com.bridelabz.employeewage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CompanyEmployeeWage {
    public final String company;
    public final int empPerHourRate;
    public static int numOfWorkingDays;
    public static int maxHoursPerMonth;
    public int totalEmpWage;

    public CompanyEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empPerHourRate = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        totalEmpWage = 0;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Employee Wage For Company: " + company + "is: " + totalEmpWage;
    }

    public static class EmpWageBuilder implements IComputeEmpWage {
        public static final int PART_TIME = 1;
        public static final int FULL_TIME = 2;
        private int numOfCompany = 0;
        private LinkedList<CompanyEmployeeWage> companyEmpWageList;
        private Map<String, CompanyEmployeeWage> companyToEmpWageMap;

        public EmpWageBuilder() {
            companyEmpWageList = new LinkedList<>();
            companyToEmpWageMap = new HashMap<>();
        }

        public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
            CompanyEmployeeWage companyEmployeeWage = new CompanyEmployeeWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
            companyEmpWageList.add(companyEmployeeWage);
            companyToEmpWageMap.put(company, companyEmployeeWage);
        }

        public void computeEmpWage() {
            for (int i = 0; i < companyEmpWageList.size(); i++) {
                CompanyEmployeeWage companyEmployeeWage = companyEmpWageList.get(i);
                companyEmployeeWage.setTotalEmpWage(this.computeEmpWage(companyEmployeeWage));
                System.out.println(companyEmployeeWage);

            }
        }

        @Override
        public int getTotalWage(String company) {
            return companyToEmpWageMap.get(company).totalEmpWage;
        }

        public int computeEmpWage(CompanyEmployeeWage companyEmployeeWage) {
            return 0;
        }

        public static void main(String[] args) {
            IComputeEmpWage empWageBuilder = new EmpWageBuilder();
            empWageBuilder.addCompanyEmpWage("Jio", 45, 25, 9);
            empWageBuilder.addCompanyEmpWage("Accenture", 50, 22, 10);
            empWageBuilder.computeEmpWage();
            System.out.println("TotalWage For Jio Company: " + empWageBuilder.getTotalWage("Jio"));
        }
    }
}
