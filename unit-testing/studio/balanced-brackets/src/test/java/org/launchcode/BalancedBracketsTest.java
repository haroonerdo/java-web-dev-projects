package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }
    //The function BalancedBrackets should return true if and only if
    //  * the input string has a set of "balanced" brackets.
    @Test
    public void simpleBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void mistakeBracketsReturnsTrue(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


//    That is, whether it consists entirely of pairs of opening/closing
//     * brackets (in that order), none of which mis-nest. We consider a bracket
//     * to be square-brackets: [ or ].
    @Test
    public void doubleBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void nestedDoubleBracketBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void nestedTripleBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    //The string may contain non-bracket characters as well.
    @Test
    public void stringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    //These strings have balanced brackets
    @Test
    public void stringInTheBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode] "));
    }

    @Test
    public void stringAndOneBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void singleOpenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleCloseBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void stringOutTheBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode "));
    }
    @Test
    public void bracketsInTheStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code] "));
    }

    @Test
    public void randomReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
    }

    @Test
    public void random1ReturnsTrue(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[]]]"));
    }
    @Test
    public void random2ReturnsTrue(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]][[[["));
    }


}