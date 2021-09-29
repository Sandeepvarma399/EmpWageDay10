package org.EmoloyeeWages.blz;


public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int wageForHour = 20;
        int fullTimeHours = 8;
        int partTimeHours = 4;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == 1) {
            System.out.println(" Employee Is Present");
            System.out.println(" Employee is fulltime EMPLOYEE");
            System.out.println("Daily EmployeeWage for fulltime employee Is " + wageForHour * fullTimeHours);
        } else if (empCheck == 2) {
            System.out.println(" Employee Is Present");
            System.out.println(" Employee is Parttime EMPLOYEE");
            System.out.println("Daily EmployeeWage for parttime employee Is " + wageForHour * partTimeHours);
        } else {
            System.out.println(" Employee Is Absent");
        }

    }
}

