package org.launchcode;
import java.util.Arrays;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String firstSentence="Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";
        String firstSentenceUpperCase=firstSentence.toUpperCase();
        //System.out.println(firstSentenceUpperCase);
        //System.out.println(firstSentenceUpperCase.length());
        //String[] arr =firstSentenceUpperCase.split(" ");
        //System.out.println(Arrays.toString(arr));
        //System.out.println(arr.length);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String searchTerm = in.next();
        if (firstSentenceUpperCase.contains(searchTerm.toUpperCase())){
            System.out.println("this sentence has " + searchTerm);
        }else{
            System.out.println("this sentence doesn't have " + searchTerm);
        }

        int index = firstSentenceUpperCase.indexOf(searchTerm);
        int length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentenceUpperCase.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }
}
