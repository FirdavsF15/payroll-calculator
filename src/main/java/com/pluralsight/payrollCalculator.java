package com.pluralsight;

import java.util.Scanner;

public class payrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your hours worked: ");
        //float hoursWorked = scanner.nextFloat();
        float hoursWorked = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter your pay rate:");
        //float payRate = scanner.nextFloat();
        float payRate = Float.parseFloat(scanner.nextLine());

        //scanner.nextLine();  if I did it the other way

        System.out.printf("Hello %s, your gross pay is %.2f", name, hoursWorked * payRate);
    }
}
