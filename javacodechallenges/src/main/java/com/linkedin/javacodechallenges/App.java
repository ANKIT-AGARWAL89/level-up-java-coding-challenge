package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        // METHOD 1 (My method)
        // if (password.length() < 6) {
        // return false;
        // }

        // boolean hasUpperCase = false;
        // boolean hasLowerCase = false;
        // boolean hasDigit = false;
        // for (int i = 0; i < password.length(); i++) {

        // if (password.charAt(i) <= 90 && password.charAt(i) >= 65) {
        // hasUpperCase = true;
        // continue;
        // }

        // else if (password.charAt(i) <= 122 && password.charAt(i) >= 97) {
        // hasLowerCase = true;
        // continue;
        // }

        // else if (password.charAt(i) <= 57 && password.charAt(i) >= 48) {
        // hasDigit = true;
        // }

        // }

        // return hasUpperCase == true && hasLowerCase == true && hasDigit == true;


// METHOD 2 (mentor's method)
        // return password.length() >= 6
        //         && password.matches(".*\\d.*")
        //         && password.matches(".*[A-Z].*.")
        //         && password.matches(".*[a-z].*");

// METHOD 3 (mentor's method)
         if (password.length() < 6) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        for(int i=0; i<password.length();i++){
            char current = password.charAt(i);
            if(Character.isDigit(current)){
                hasDigit = true;
            }
            else if(Character.isUpperCase(current)){
                hasUpperCase = true;
            }
            else if(Character.isLowerCase(current)){
                hasLowerCase = true;
            }
        }
        return hasDigit && hasLowerCase && hasUpperCase;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
