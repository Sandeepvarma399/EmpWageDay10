package org.EmoloyeeWages.blz;


public class EmployeeWages {
    public static final int  IS_FULL_TIME = 1;
    public static final int  IS_PART_TIME = 2;
    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public EmployeeWages(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company =company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        EmployeeWages company1 = new EmployeeWages("Epam",15,25,100);
        EmployeeWages company2 = new EmployeeWages("tcs",13,15,80);
        EmployeeWages company3 = new EmployeeWages("bridgelabz",10,18,90);
        company1.employeeWage();
        company3.employeeWage();
        company3.employeeWage();


    }
    public int  employeeWage() {
        int empWage = 0;

        int empHrs = 0;
        int totalEmpHours = 0;
        int day = 1;
        while (day <= numOfWorkingDays && totalEmpHours <= maxHoursPerMonth ) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:

                    empHrs = 8;

                    break;
                case IS_PART_TIME:

                    empHrs = 4 ;

                    break;
                default:

                    empHrs = 0;



            }

            empWage = empHrs * empRatePerHr;
            totalEmpWage = totalEmpWage + empWage;
            totalEmpHours = totalEmpHours + empHrs;

            System.out.println(" Emp Wage: " + empWage);
            day++;
        }

        System.out.println("Total Emp Wage " + company + " is " + totalEmpWage );
        return totalEmpWage;


        }
    }


