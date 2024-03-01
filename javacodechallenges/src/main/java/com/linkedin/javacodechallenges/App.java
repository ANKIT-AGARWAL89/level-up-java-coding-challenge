package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        double MinCharges = 18.84;
        if (gallonsUsage <= 1496) {
            return MinCharges;
        } else {
            double ccf = gallonsUsage / 748;
            return MinCharges + Math.ceil(ccf - 2) * 3.9;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
