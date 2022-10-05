package com.sparta.jn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PalindromeTest
{
//    @Test
//    @DisplayName("Should return string **AbCdEfGhIjK** that is reversed")
//    public void shouldReturnReverseStringAbCdEfGhIjK() {
//        Assertions.assertEquals("KjIhGfEdCbA", Palindrome.reverseString("AbCdEfGhIjK"));
//    }

    @Test
    @DisplayName("If the string is **deified** then should return true")
    void returnTrueIfStringIsdeified() {
//        String[] palindromeArry = {"kayak", "deified", "rotator", "repaper", "deed", "peep", "wow", "noon", "civic",
//                "racecar", "level", "mom",};
        Assertions.assertTrue(Palindrome.isPalindrome("deified"));

    }

    @Test
    @DisplayName("If string is empty should return true")
    void stringEmptyreturnTrue() {
        Assertions.assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    @DisplayName("Should return true if palindrone has different case")
    void ifStringIskAyakReturnTrue() {
        Assertions.assertTrue(Palindrome.isPalindrome("kAyak"));
    }

    @Test
    @DisplayName("Should return false if string is null")
    void ifStringIsNullReturnFalse() {
        Assertions.assertFalse(Palindrome.isPalindrome(null));
    }

    @Test
    @DisplayName("Return largest palindrome in a sentence with only spaces")
    void returnLargestPalindromeInASentenceWithOnlySpaces() {
        String sentence = "The characters read the same backward as forward Some examples of palindromic words are " +
                "redivider deified civic radar level rotor kayak reviver racecar madam and refer";
        Assertions.assertEquals("redivider", Palindrome.largestPalindrome(sentence));

    }
    @Test
    @DisplayName("Return largest palindrome in a sentence with commas and fullstops")
    void returnLargestPalindromeInASentenceWithCommasAndFullstops() {
        String sentence = "The characters read the same backward as forward. Some examples of palindromic words are " +
                "redivider, deified, civic, radar, level, rotor, kayak, reviver racecar, madam, and refer";
        Assertions.assertEquals("redivider", Palindrome.largestPalindrome(sentence));
    }

    @Test
    @DisplayName("Returns empty string if there is not palindrome")
    void returnsEmptyStringIfThereIsNotPalindrome() {
        String sentence = "The characters read the same backward as forward Some examples of palindromic words are";
        Assertions.assertEquals("", Palindrome.largestPalindrome(sentence));
    }
}
