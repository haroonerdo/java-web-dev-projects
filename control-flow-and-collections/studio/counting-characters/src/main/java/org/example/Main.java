package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> countingChars = new HashMap<>();

        for(char letter : charactersInString){
            if(!countingChars.containsKey(letter)){
                countingChars.put(letter,1);
            }else{
                countingChars.put(letter,countingChars.get(letter)+1 );
            }
        }

        for (Map.Entry<Character, Integer> letters : countingChars.entrySet()) {
            System.out.println(letters.getKey() + ": " + letters.getValue() );
        }
    }
}
