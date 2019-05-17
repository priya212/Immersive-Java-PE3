/*
 * Created by:Priyanka
 * Date:14/5/2019
 * This program is used test that given array throw an exception or not.
 */
package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionHandlingTest {
    ExceptionHandling obj;
    @Before
    public void setUp() {
        //arrange
        obj=new ExceptionHandling();
    }
    @After
    public void tearDown() {
        //arrange
        obj=null;
    }

    /* Negative array size throw exception as NegativeArraySizeException */
    @Test(expected=NegativeArraySizeException.class)
    public void negativeArrayIndexOutOfBoundException() {
       String[] array=new String[-3];
       assertEquals("Negative Array Index Exception",obj.exceptionChecking(array));
    }
    /* Invalid array index throw exception as IndexOutOfBoundsException */
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void ArrayIndexOutOfBoundsException() {
        String[] array={"2","6","5"};
        assertEquals("Array Index Out Of Bound Exception",obj.exceptionChecking(array));
    }
    /* Given a null object throw exception as NullPointerException */
    @Test(expected=NullPointerException.class)
    public void NullPointerException() {
        String[] array=null;
        assertEquals("Null Pointer Exception",obj.exceptionChecking(array));
    }
}