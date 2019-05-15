package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    ConsecutiveNumbers obj=new ConsecutiveNumbers();

    @Test
    public void test1()
    {
        String array1="98,96,95,94,93";
        String outputExp="Non consecutive numbers";
        String result=obj.ConsecutiveNum(array1);
        assertEquals(outputExp,result);

    }
    @Test
    public void test2()
    {
        String array1="54,53,52,51,50,49,48";
        String outputExp="Consecutive numbers";
        String result=obj.ConsecutiveNum(array1);
        assertEquals(outputExp,result);

    }
    @Test
    public void test3()
    {
        String array1="6,6,6,6,6,6";
        String outputExp="Non consecutive numbers";
        String result=obj.ConsecutiveNum(array1);
        assertEquals(outputExp,result);

    }
    @Test
    public void test4()
    {
        String array1="0,-1,-2,-3,-4,-5";
        String outputExp="Consecutive numbers";
        String result=obj.ConsecutiveNum(array1);
        assertEquals(outputExp,result);

    }
}