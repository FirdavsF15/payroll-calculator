package com.pluralsight;

import java.util.Scanner;

public class payrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your hours worked: ");
        float hoursWorked = scanner.nextFloat();

        System.out.println("Enter your pay rate");
        float payRate = scanner.nextFloat();

        scanner.nextLine();

        System.out.printf("Hello %s, your gross pay is %.2f", name, hoursWorked * payRate);
    }
}
