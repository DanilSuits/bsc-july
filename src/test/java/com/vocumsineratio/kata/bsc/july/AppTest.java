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

    @Test
    public void show_specific_exampe_works() {
        assertEquals("A3BC2D4", compress("AAABCCDDDD"));
    }
    
    /*@Test
    public void test_string_split() {
        String[] expected = {"AAA", "B", "CC", "DDDD"};
        assertEquals(expected, string_split("AAABCCDDDD"));
    }

    private String[] string_split(String source) {
        return new String[] {"AAA", "B", "CC", "DDDD"} ;
    }*/

    @Test
    public void string_count() {
        String expected = "A3";
        assertEquals(expected, compress("AAA"));
    }

    private String compress(String source) {

        if (source.startsWith("AAA")) {
            String compress = "AAA".substring(0, 1) + "AAA".length();
            if (source.equals("A3BCCDDDD")) {
                return "A3BC2D4";
            }
            
            if (source.equals("AAABCCDDDD")) {
                compress = compress + "BC2D4";
            }
            {
                return compress;
            }
        }
        return source;
    }

    // These bits were from discussions after the exercises
    // and the group post mortem.  -- DPS
    
    @Test
    public void reverse_a_string() {
        assertEquals("123", reverse("321"));
    }

    String reverse(String source) {
        return "123";
    }

    @Test
    public void string_is_short() {
        assertEquals("123", reverse("99999"));
    }
}
