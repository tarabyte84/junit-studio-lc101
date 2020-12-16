package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

//            1. If Array index 0 == ], !hasBalancedBrackets
//            2. If last character in array (char array.size()-1) == [, !hasBalancedBrackets
//            3. If brackets !== 0, !hasBalancedBrackets
//            4. Assert true brackets == 0
//          * 5. hasBalancedBrackets([“LaunchCode”]) == true
//          * 6. hasBalancedBrackets(“Launch[Code]”) == true
//          * 7. hasBalancedBrackets (”[]LaunchCode”) == true

//            *9. hasBalancedBrackets(“[LaunchCode”) == false
//            *10. hasBalancedBrackets(“Launch]Code[”) == false
//           * 11. hasBalancedBrackets(“[”) == false
//            *12. hasBalancedBrackets(“][”) == false
//            13. If brackets > 0, !hasBalancedBrackets
//            14. If brackets < 0, !hasBalancedBrackets

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //TODO: Assert that brackets in the correct order, "[]", return true.
    @Test
    public void onlyBracketsReturnsTrue1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void shouldReturnTrue2() { assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode")); }

    @Test
    public void shouldReturnTrue3() { assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));}

    @Test
    public void shouldReturnTrue4() { assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));}

    //TODO: Assert that brackets in the incorrect order, or unbalanced number, "[]", return false.
    @Test
    public void shouldReturnFalse5() { assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));}

//    @Test
//    public void shouldReturnFalse6() {
//        if (brackets > 0)
//    }

//    If Array index 0 == ], !hasBalancedBrackets
//    @Test
//    public void shouldReturnFalseIfClosingBracketIsFirstCharacter() {assertFalse(BalancedBrackets.hasBalancedBrackets(""));}


//    @Test
//    public void shouldReturnFalse2() { assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));}

    @Test
    public void shouldReturnFalse3() { assertFalse(BalancedBrackets.hasBalancedBrackets("["));}

//    @Test
//    public void shouldReturnFalse4() { assertFalse(BalancedBrackets.hasBalancedBrackets("]["));}


}
