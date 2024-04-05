package org.example;

import java.util.HashMap;

public class CharacterCounting {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Character, Integer> countingChars = new HashMap<>();
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        // Create char array
        char[] charactersInString=myString.toCharArray();

        // This part makes the string and update character counts
        for (char c : charactersInString) {
            if (Character.isLetterOrDigit(c)) { // .isLetterOrDigit for  alphanumeric characters
                countingChars.put(c, countingChars.getOrDefault(c, 0) + 1);
            }
        }

        // This part makes the HashMap to print character counts
        for (char c : countingChars.keySet()) {
            System.out.println(c + ": " + countingChars.get(c));
        }


    }
}
