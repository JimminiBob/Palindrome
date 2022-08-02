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
}
