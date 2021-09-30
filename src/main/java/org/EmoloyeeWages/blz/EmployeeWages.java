package org.EmoloyeeWages.blz;


public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int wagePerHour = 20;
        int fullTimeHours = 8;
        int partTimeHours = 4;
        int workingDays = 20;
        int Hours = 0;
        int days =1;
        int totalHours = 100;
        int totalDays = 20;


        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        while (days <=workingDays && Hours < totalHours ) {
            switch (empCheck) {
                case 1:
                    System.out.println(" Employee Is Present");
                    System.out.println(" Employee is fulltime EMPLOYEE");
                    System.out.println("Daily EmployeeWage for fulltime employee Is " + wagePerHour * fullTimeHours * workingDays);
                    break;
                case 2:
                    System.out.println(" Employee Is Present");
                    System.out.println(" Employee is Parttime EMPLOYEE");
                    System.out.println("Daily EmployeeWage for parttime employee Is " + wagePerHour * partTimeHours * workingDays);
                    break;
                default:
                    System.out.println(" Employee Is Absent");
            }






            }

        }
    }


