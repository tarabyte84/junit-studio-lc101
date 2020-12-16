package main;


import java.lang.reflect.Array;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
//        char[] array = str.toCharArray();
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            }
        }
        return brackets == 0;
    }
}

//openBracket = 0
//closingBracket = 0

//    public static boolean hasBalancedBrackets(String str) {
//        char[] array = str.toCharArray();
//        int numOpenBrackets = 0;
//        int numCloseBrackets = 0;
//        int indexOpenBracket;
//        int indexCloseBracket;
//
//        if(array.contains([)) {
//        numOpenBrackets +=1;
//        indexOpenBracket
//        }
//    }


    }
