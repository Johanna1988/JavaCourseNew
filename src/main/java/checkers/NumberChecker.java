package main.java.checkers;

import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        System.out.println("Please enter your number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 0 )
            System.out.println("Your number is negative");
        else if (number > 0 )
            System.out.println("Your number is positive");

        System.out.println("Please enter your number");
        Scanner scan2 = new Scanner(System.in);
        int number2 = scan2.nextInt();
        if (number2 % 2 == 0 )
            System.out.println("Your number even ");
        else if (number2 % 2 == 1 )
            System.out.println("Your number is odd");
        }
    }
