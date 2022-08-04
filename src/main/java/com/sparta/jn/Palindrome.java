package com.sparta.jn;

public class Palindrome {
    public boolean letterExists(String strIn, String strSearch) {
        return strSearch.contains(strIn);
    }
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

    public static String largestPalindrome(String sentenceIn) {

        int sentenceLength = sentenceIn.length();
        for (int i = 0; i < sentenceLength - 1; i++) {
            if (sentenceIn.charAt(0) == ' ') {

            }
        }
    }

//    public static String[] sentenceToStrArray(String sentenceIn) {
//        int sentenceLen = sentenceIn.length();
//        String[] A
//        for (int i = 0; i < sentenceLen-1; i++) {
//            if(sentenceIn.charAt(i) == ' ') {
//
//            }
//
//        }
//    }
}
