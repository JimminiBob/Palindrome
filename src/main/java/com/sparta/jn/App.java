package com.sparta.jn;

public class App 
{
    public static void main( String[] args )
    {
        String sentence1 = "The characters read the same backward as forward. Some examples of palindromic words are " +
                "redivider, deified, civic, radar, level, rotor, kayak, reviver racecar, madam, and refer";
        String sentence2 = "The characters read the same backward as forward Some examples of palindromic words are " +
                "redivider deified civic radar level rotor kayak reviver racecar madam and refer";
        System.out.println(Palindrome.largestPalindrome(sentence2));
    }
}
