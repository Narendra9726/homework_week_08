package homework_week08;
/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Programme5_Iterate {
    public static void main(String[] args) {
        // Create a new ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Aplle");
        fruits.add("Bnan");
        fruits.add("Mango");

        // Get an Iterator for the ArrayList
        Iterator<String> iterator = fruits.iterator();

        // Use the Iterator to iterate through the elements
        System.out.println("Iterating through the ArrayList using Iterator:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
