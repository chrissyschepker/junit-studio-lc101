package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //test 2:
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //test 3:
    @Test
    public void twoNestedBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    //test 4:
    @Test
    public void threeNestedBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    //test 5:
    @Test
    public void fourNestedBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }

    //test 6:
    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //test 7:
    @Test
    public void bracketWithStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[string]"));
    }

    //test 8:
    @Test
    public void oneLeftBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    //test 9:
    @Test
    public void oneRightBracketReturnsTrue(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    //test 10:
    @Test
    public void twoDoubleNestedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][]]]"));
    }

    //test 11:
    @Test
    public void fiveNestedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[]]]]]"));
    }

    //test 12:
    @Test
    public void unequalBracketsWithStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[string]]"));
    }
}
