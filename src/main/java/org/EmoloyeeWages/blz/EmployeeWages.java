package org.EmoloyeeWages.blz;


public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        int IS_FULL_TIME = 1;
        int wageFORHOUR = 20;
        int numberOfHours = 8;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == 1) {
            System.out.println(" Employee Is Present");
        } else {
            System.out.println(" Employee Is Absent");
        }
        if (empCheck == 1) {
            System.out.println("Daily EmployeeWage Is " + wageFORHOUR * numberOfHours);
        }
    }
}
