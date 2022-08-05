package com.sparta.jn;

public class Palindrome {
//    public boolean letterExists(String strIn, String strSearch) {
//        return strSearch.contains(strIn);
//    }
    public static String reverseString(String strIn) {

        String reversedStr = "";
        for (int i = strIn.length() - 1; i >= 0; i--) {
            reversedStr += strIn.charAt(i);
        }
        return reversedStr;
    }

    public static boolean isPalindrome(String strIn) {
        if (strIn == null) {
            return false;
        }
        String reversedStr = reverseString(strIn);
        return strIn.equalsIgnoreCase(reversedStr);
    }

//    private static boolean isInIgnoreChars(char charIn) {
//        char[] ignoreChars = {' ', '.', ','};
//        for (char element: ignoreChars) {
//            if (element == charIn)
//                return true;
//        }
//        return false;
//    }

    public static String largestPalindrome(String sentenceIn) {
        int sentenceLength = sentenceIn.length();
        int leftPointer = 0;
        String palindrome = "";
        for (int i = 0; i < sentenceLength - 1; i++) {
            if (sentenceIn.charAt(i) == ' ') {
                String word = sentenceIn.substring(leftPointer,i);
                word = word.strip();
                leftPointer = i;
                if(Palindrome.isPalindrome(word)) {
                    if(word.length() > palindrome.length())
                        palindrome = word;
                }
            }
        }
        return palindrome;
    }
}
