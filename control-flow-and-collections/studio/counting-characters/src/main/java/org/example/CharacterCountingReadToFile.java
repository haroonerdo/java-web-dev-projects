package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CharacterCountingReadToFile {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Character, Integer> countingChars = new HashMap<>();

        String filePath = "/Users/aerdogan/IdeaProjects/java-web-dev-projects/control-flow-and-collections/studio/counting-characters/src/main/java/org/example/ReadToFile.txt";

        //Used the BufferReader with try-catch block and put their inside char array and for-each loop
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                // Create char array
                char[] charactersInString=line.toCharArray();
                // This part makes the string and update character counts
                for (char c : charactersInString) {
                    if (Character.isLetterOrDigit(c)) { // .isLetterOrDigit for  alphanumeric characters
                        countingChars.put(c, countingChars.getOrDefault(c, 0) + 1);
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

        // This part makes the HashMap to print character counts
        for (char c : countingChars.keySet()) {
            System.out.println(c + ": " + countingChars.get(c));
        }
    }
}
