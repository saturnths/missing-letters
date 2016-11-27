package com.missingletters;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class MissingLettersTest {

    private final Solution so = new Solution();
    private String result;
    private String expected;

    @Test
    public void emptySentenceTest() {
        result = so.getMissingLetters("");
        expected = "abcdefghijklmnopqrstuvwxyz";

        assertEquals(expected, result);
    }

    @Test
    public void validPangramTest() {
        result = so.getMissingLetters("A quick brown fox jumps over the lazy dog");
        expected = "";

        assertEquals(expected, result);
    }

    @Test
    public void someLettersMissingTest() {
        result = so.getMissingLetters("A quick brown fox jumps over the lazy");
        expected = "dg";

        assertEquals(expected, result);
    }

    @Test
    public void moreLettersMissingTest() {
        result = so.getMissingLetters("A slow yellow fox crawls under the proactive dog");
        expected = "bjkmqz";

        assertEquals(expected, result);
    }

    @Test
    public void nonUsAsciiNonAlphabeticCharactersTest() {
        result = so.getMissingLetters("öäA quick brown fox jumps over the lazy dog 123");
        expected = "";

        assertEquals(expected, result);

        result = so.getMissingLetters("öä123");
        expected = "abcdefghijklmnopqrstuvwxyz";

        assertEquals(expected, result);
    }

    @Test
    public void ignoreCaseTest() {
        result = so.getMissingLetters("A QUICK BROWN FOX jumps over the lazy dog");
        expected = "";

        assertEquals(expected, result);
    }
}