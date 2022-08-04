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
    @DisplayName("Should return string **AbCdEfGhIjK** that is reversed")
    public void shouldReturnReverseStringAbCdEfGhIjK() {
        Palindrome stringy = new Palindrome();
        Assertions.assertEquals("KjIhGfEdCbA", stringy.reverseString("AbCdEfGhIjK"));
    }

    @Test
    @DisplayName("If the string is **deified** then should return true")
    void returnTrueIfStringIsdeified() {
//        String[] palindromeArry = {"kayak", "deified", "rotator", "repaper", "deed", "peep", "wow", "noon", "civic",
//                "racecar", "level", "mom",};
        Palindrome stringy = new Palindrome();
        Assertions.assertTrue(stringy.isPalindrome("deified"));

    }

    @Test
    @DisplayName("If string is empty should return true")
    void stringEmptyreturnTrue() {
        Palindrome stringy = new Palindrome();
        Assertions.assertTrue(stringy.isPalindrome(""));
    }

    @Test
    @DisplayName("Should return true if palindrone has different case")
    void ifStringIskAyakReturnTrue() {
        Palindrome stringy = new Palindrome();
        Assertions.assertTrue(stringy.isPalindrome("kAyak"));
    }

    @Test
    @DisplayName("Should return false if string is null")
    void ifStringIsNullReturnFalse() {
        Palindrome stringy = new Palindrome();
        Assertions.assertFalse(stringy.isPalindrome(null));
    }
}
