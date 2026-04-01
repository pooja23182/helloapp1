package org.example;

public class UC7 {
    public static void main(String[] args) {

        String greeting;

        // Check if arguments are provided
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            // Join all names with ", "
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        }

        // Print the greeting
        System.out.println(greeting);
    }
}

