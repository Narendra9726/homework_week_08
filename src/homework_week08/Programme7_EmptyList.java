package homework_week08;
/**
 * Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Programme7_EmptyList {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Ask the user to add elements to the ArrayList
        System.out.println("Add elements to the ArrayList (type 'done' to stop):");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            }
            list.add(input);
        }
        // Check if the ArrayList is empty
        boolean isEmpty = list.isEmpty();

        if (isEmpty) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
        // Closing scanner
        scanner.close();
    }
}
