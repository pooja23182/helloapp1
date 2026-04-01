package org.example;

public class UC5 {
    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        // Check if no arguments are provided
        if (args.length == 0) {
            names.append("World");
        } else {
            // Iterate through arguments using enhanced for loop
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);

                // Avoid trailing comma
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }
        }

        // Print final greeting
        System.out.println("Hello, " + names.toString() + "!");
    }


}


