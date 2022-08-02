package com.sparta.jn;

public class MyStrings {
    public boolean letterExists(String strIn, String strSearch) {
        return strSearch.contains(strIn);
    }
    public String reverseString(String strIn) {
        String reversedStr = "";
        for (int i = strIn.length()-1; i >=0; i--) {
            reversedStr += strIn.charAt(i);
        }
        return reversedStr;
    }

    public boolean isPalindrome(String strIn) {
        
    }
}
