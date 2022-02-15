package main.java;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int number1, number2, result;
        char action;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        number1 = input.nextInt();
        System.out.println("Please provide an action: /, *, -, + ");
        action = input.next().charAt(0);
        System.out.println("Please enter second number");
        number2 = input.nextInt();
        switch (action) {
            case '/':
                result = number1 / number2;
                System.out.println("The result is:");
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("The result is:");
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("The result is:");
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '+':
                result = number1 + number2;
                System.out.println("The result is:");
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
        }
    }
}
