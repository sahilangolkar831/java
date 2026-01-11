/*Write a Java program to demonstrate the use of the Collection interface by creating a collection of elements 
and performing basic operations such as adding elements, removing an element, 
checking the number of elements, searching for an element, 
checking whether the collection is empty, and 
clearing all elements from the collection.*/

import java.util.*;

class CollectionInterfaceExample {

    public static void main(String[] args) {

        // Creating Collection reference
        Collection<String> names = new ArrayList<>();

        // Adding elements
        names.add("Ravi");
        names.add("Anil");
        names.add("Meena");
        names.add("Ravi");   // Duplicate allowed

        System.out.println("Elements in the Collection:");
        for (String n : names) {
            System.out.println(n);
        }

        // Size of collection
        System.out.println("Total elements: " + names.size());

        // Checking element
        System.out.println("Contains Ravi? " + names.contains("Ravi"));

        // Removing element
        names.remove("Anil");
        System.out.println("After removing Anil: " + names);

        // Checking empty
        System.out.println("Is collection empty? " + names.isEmpty());

        // Clearing collection
        names.clear();
        System.out.println("After clear, is empty? " + names.isEmpty());
    }
}


