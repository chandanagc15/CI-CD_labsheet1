package calculater;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Create Scanner object
        System.out.print("Enter a number: ");
        int num = reader.nextInt();  // Read integer input

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

        reader.close();  // Close the scanner
    }
}

