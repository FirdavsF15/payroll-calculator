package com.pluralsight;

import java.util.Scanner;

public class payrollCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //take all necessary input
        String name = getName();
        float hoursWorked = getHoursWorked();
        float payRate = getPayRate();

        System.out.printf("Hello %s, your gross pay is $%.2f", name, calcPay(hoursWorked, payRate));



    }

    public static String getName(){
        System.out.println("Enter your name: ");
        return scanner.nextLine();
    }

    public static float getHoursWorked(){
        System.out.println("Enter your hours worked: ");
        return Float.parseFloat(scanner.nextLine());
    }

    public static float getPayRate(){
        System.out.println("Enter your pay rate:");
        return Float.parseFloat(scanner.nextLine());
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
