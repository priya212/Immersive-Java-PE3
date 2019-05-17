/*
 * Created by:Priyanka
 * Date:14/5/2019
 * This program is used to test out is vowel present in given string or not.
 * If found then remove it display only consonant.
 * If number is present in string then display error message.
 * If input is null then display error message.
 */
package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsCheckingTest {
    VowelsChecking obj;
    @Before
    public void setUp() {
        //arrange
        obj=new VowelsChecking();
    }
    @After
    public void tearDown() {
        //arrange
        obj=null;
    }

    /* String with 2 vowels and consonants should return the string only with consonants.*/
    @Test
    public void deleteVowels ()throws Exception {
        String input="anxe";
        String output=obj.removeVowels(input);
        assertEquals("nx",output);

    }
    /* tring with one vowel should return empty string. */
    @Test
    public void deleteSingleVowels() throws Exception {
        String input="a";
        String output=obj.removeVowels(input);
        assertEquals("",output);

    }
    /* String with all vowels should return empty string.*/
    @Test
    public void deleteAllVowels() throws Exception {
        String input="aeiou";
        String output=obj.removeVowels(input);
        assertEquals("",output);

    }
    /* null string should return an error message "Input string cannot be null". */
    @Test
    public void ifInputIsEmptyStringDisplayMessage() throws Exception {
        String input="";
        String output=obj.removeVowels(input);
        assertEquals("Input string cannot be null",output);

    }
    /* string contain numeric value should return an error message "Input String should contain only characters".*/
    @Test(expected = Exception.class)
    public void ifInputContainsNumericValueDisplayErrorMessage() throws Exception {
        String input="pri123";
        String output=obj.removeVowels(input);
        assertEquals("Input string only contain characters",output);

    }

}