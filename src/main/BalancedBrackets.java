package main;

import java.lang.*;

public class BalancedBrackets {

    public static void main(String []args){
        System.out.println(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

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
        String bracket = "";

        for (char ch : str.toCharArray()) {
            if (ch == ']' && bracket.isEmpty()) {
                return false;
            } else if (ch == '[' && bracket.equals("[")) {
                return false;
            } else if (ch == '[' && bracket.isEmpty()) {
                String currentBracket = Character.toString(ch);
                bracket = currentBracket;
            } else if (ch == ']' && bracket.equals("[")) {
                bracket = "";
            }
        }

        if (bracket.length() >= 1) {
            return false;
        }
        return true;
    }
//    public static boolean hasBalancedBrackets(String str) {
//        int brackets = 0;
//        for (char ch : str.toCharArray()) {
//            if (ch == '[') {
//                brackets++;
//            } else if (ch == ']') {
//                brackets--;
//            }
//        }
//        return brackets == 0;
//    }
}
