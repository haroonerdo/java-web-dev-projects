package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCountingBonus {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Character, Integer> counts = new HashMap<>();

        //Create Scanner for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String newStr= input.nextLine();

        //if statement and for-each loop for each character and count
        if(!newStr.isEmpty()){
            char[]charsNewStr=newStr.toUpperCase().toCharArray();
            for (char c : charsNewStr) {
                if (Character.isLetter(c)) { // .isLetter(c) for alphabetic characters
                    counts.put(c, counts.getOrDefault(c,0) + 1);
                }
            }
        }
        //for-each loop for write to console
        for (char c : counts.keySet()) {
            System.out.println(c + ": " + counts.get(c));
        }
    }
}
