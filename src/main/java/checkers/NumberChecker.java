package main.java.checkers;

import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        System.out.println("Please enter your number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 0) {
            System.out.println("Your number is negative");
        } else if (number > 0) {
            System.out.println("Your number is positive");
        } else {
            System.out.println("You have entered zero");
        }
        System.out.println("Please enter your number");
        int number2 = scan.nextInt();
        if (number2 % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
