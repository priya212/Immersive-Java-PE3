package com.stackroute.pe3;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class exceptionHandlingTest {
    exceptionHandling obj=new exceptionHandling();

    @Test(expected=NegativeArraySizeException.class)
    public void test1()
    {
       String[] array=new String[-3];
       assertEquals("Negative Array Index Exception",obj.exceptionChecking(array));
    }


    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void test2()
    {
        String[] array={"2","6","5"};
        assertEquals("Array Index Out Of Bound Exception",obj.exceptionChecking(array));
    }


    @Test(expected=NullPointerException.class)
    public void test3()
    {
        String[] array=null;
        assertEquals("Null Pointer Exception",obj.exceptionChecking(array));
    }

}