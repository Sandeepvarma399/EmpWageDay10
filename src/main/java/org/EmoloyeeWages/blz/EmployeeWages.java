package org.EmoloyeeWages.blz;


public class EmployeeWages {
    public static final int  IS_FULL_TIME = 1;
    public static final int  IS_PART_TIME = 2;
    public static final int  WAGE_PER_HOUR = 20;
    public static final int  WORKING_DAYS = 20;
    public static final int  TOTAL_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        EmployeeWage();

    }
    public static void EmployeeWage() {
        int empWage = 0;
        int totalEmpWage = 0 ;
        int empHrs = 0;
        int totalEmpHours = 0;
        int day = 1;
        while (day <= WORKING_DAYS && totalEmpHours <= TOTAL_HOURS ) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    System.out.println("day " + day);
                    empHrs = 8;
                    System.out.println(" Employee Is Present");
                    System.out.println(" Employee is fulltime EMPLOYEE");
                    break;
                case IS_PART_TIME:
                    System.out.println("day " + day);
                    empHrs = 4 ;
                    System.out.println(" Employee Is Present");
                    System.out.println(" Employee is Parttime EMPLOYEE");
                    break;
                default:
                    System.out.println("day " + day);
                    empHrs = 0;
                    System.out.println(" Employee Is Absent");
            }

            empWage = empHrs * WAGE_PER_HOUR;
            totalEmpWage = totalEmpWage + empWage;
            totalEmpHours = totalEmpHours + empHrs;

            System.out.println(" Emp Wage: " + empWage);
            day++;
        }
        System.out.println("Total Hours: " +  totalEmpHours);
        System.out.println("Total Emp Wage " + totalEmpWage);

        }
    }


