package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsCheckingTest {
    VowelsChecking obj=new VowelsChecking();
    @Test
    public void deleteVowels ()throws Exception
    {
        String input="anxe";
        String output=obj.removeVowels(input);
        assertEquals("nx",output);

    }
    @Test
    public void deleteVowels1() throws Exception
    {
        String input="a";
        String output=obj.removeVowels(input);
        assertEquals("",output);

    }
    @Test
    public void deleteVowels2() throws Exception
    {
        String input="aeiou";
        String output=obj.removeVowels(input);
        assertEquals("",output);

    }
    @Test
    public void deleteVowels3() throws Exception
    {
        String input="";
        String output=obj.removeVowels(input);
        assertEquals("Input string cannot be null",output);

    }
    @Test(expected = Exception.class)
    public void deleteVowels4() throws Exception
    {
        String input="pri123";
        String output=obj.removeVowels(input);
        assertEquals("Input string only contain characters",output);

    }

}