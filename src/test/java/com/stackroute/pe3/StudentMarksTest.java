package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks obj=new StudentMarks();
    int[] numbers={12,-1,105};

    @Test
    public void testNum()
    {
        String[] expResult={"true","Input should be greater then 0","Input should be smaller than 100"};
        String[] output=obj.testNumber(numbers);
        assertArrayEquals(expResult,output);
    }
}