package calculater;

import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       // Prompt user for input
       System.out.println("Enter first number:");
       double num1 = input.nextDouble();
       System.out.println("Enter second number:");
       double num2 = input.nextDouble();
       System.out.println("Choose an operator: +, -, *, /");
       char operator = input.next().charAt(0);
       double result;
       // Perform operation based on user input
       switch (operator) {
           case '+':
               result = num1 + num2;
               System.out.println(num1 + " + " + num2 + " = " + result);
               break;
           case '-':
               result = num1 - num2;
               System.out.println(num1 + " - " + num2 + " = " + result);
               break;
           case '*':
               result = num1 * num2;
               System.out.println(num1 + " * " + num2 + " = " + result);
               break;
           case '/':
               if (num2 != 0) {
                   result = num1 / num2;
                   System.out.println(num1 + " / " + num2 + " = " + result);
               } else {
                   System.out.println("Error: Division by zero is not allowed.");
               }
               break;
           default:
               System.out.println("Invalid operator!");
       }
       input.close();
   }
}