package com.pluralsight;

import java.util.Scanner;

public class payrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //take all necessary input
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your hours worked: ");
        float hoursWorked = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter your pay rate:");
        float payRate = Float.parseFloat(scanner.nextLine());



        System.out.printf("Hello %s, your gross pay is $%.2f", name, calcPay(hoursWorked, payRate));



    }
    public static float calcPay(float hours, float rate){
        if( hours<=40){
            return hours * rate;
        }else{
            return calcOvertimePay(hours, rate);
        }

    }

    public static float calcOvertimePay(float hours, float rate){
        float totalPay = 40 * rate;

        hours = hours - 40;

        totalPay += hours * (rate * 1.5);
        return totalPay;
    }
}
