package com.vocumsineratio.kata.bsc.july;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void prove_the_test_works() {
        assertEquals(1, App.member);
    }

    @Test
    public void uncompressed_source_is_unchanged() {
        String source = "a";
        assertEquals("a", compress(source));
    }

    private String compress(String source) {
        return source;
    }
}
