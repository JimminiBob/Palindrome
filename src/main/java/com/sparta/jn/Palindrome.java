package com.sparta.jn;

import java.util.List;
import java.util.regex.Pattern;

public class Palindrome {
//    public boolean letterExists(String strIn, String strSearch) {
//        return strSearch.contains(strIn);
//    }
    private static String reverseString(String strIn) {

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

    private static String[] sentenceToArray(String sentence) {
        String[] words = sentence.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^a-zA-Z]","");
        }
        return words;
    }

        public static String largestPalindrome(String sentenceIn) {
            String[] words = sentenceToArray(sentenceIn);
            String largestPalindrone = "";
            for (int i = 0; i < words.length; i++) {
                if (isPalindrome(words[i]) && (words[i].length() > largestPalindrone.length())) {
                    largestPalindrone = words[i];
                }
            }
            return largestPalindrone;
        }

}
