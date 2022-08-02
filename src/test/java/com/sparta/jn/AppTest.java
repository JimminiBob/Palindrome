package com.sparta.jn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    @DisplayName("Should return a string that is reversed")
    public void shouldReturnReverseString() {
        MyStrings stringy = new MyStrings();
        Assertions.assertEquals("KjIhGfEdCbA", stringy.reverseString("AbCdEfGhIjK"));
        Assertions.assertEquals("kjihgfedcba", stringy.reverseString("abcdefghijk"));

    }

    @Test
    @DisplayName("If the string is a palindrome then should return true")
    void returnTrueIfPalindrome() {
        String[] palindromeArry = {"kayak", "deified", "rotator", "repaper", "deed", "peep", "wow", "noon", "civic",
                "racecar", "level", "mom",};
        MyStrings stringy = new MyStrings();

        for(String e: palindromeArry) {
            assert stringy.isPalindrome(e);
        }
    }

    @Test
    @DisplayName("If string is empty should return true")
    void stringEmptyreturnTrue() {
        MyStrings stringy = new MyStrings();
        Assertions.assertTrue(stringy.isPalindrome(""));
    }

    @Test
    @DisplayName("If it is palindrome return true regardless of case")
    void ifPalindroneReturnTrueIgnoresCase() {
        MyStrings stringy = new MyStrings();
        Assertions.assertTrue(stringy.isPalindrome("kAyak"));
    }

    @Test
    @DisplayName("Should return true if string is null")
    void ifStringIsNullReturnTrue() {
        MyStrings stringy = new MyStrings();
        Assertions.assertTrue(stringy.isPalindrome(null));
    }
}
