package com.bridelabz.employeewage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public interface IComputeEmpWage {
    public void addCompanyEmpWage(String company, int empPerHourRate, int numOfWorkingDays, int maxHoursPerMonth);
    public void computeEmpWage();
    public int getTotalWage(String company);
}
