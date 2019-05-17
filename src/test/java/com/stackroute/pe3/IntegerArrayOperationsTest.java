/*
 * Created by:Priyanka
 * Date:14/5/2019
 * This program is used to test that numbers from array are even or odd,
 * if given array contain prime number then delete it and display remaining numbers,
 * and reverse the given array.
 */
package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerArrayOperationsTest {
    IntegerArrayOperations obj1;
    @Before
    public void setUp() {
        //arrange
        obj1=new IntegerArrayOperations();
    }
    @After
    public void tearDown() {
        //arrange
        obj1=null;
    }

    int[] array={13,14,12};
    /* Given input as integer array and check whether numbers in array are even or odd. */
    @Test
    public void evenOddTestCases(){
        int[] array={15,14,12};
        String[] arrResult={"odd","even","even"};

        String[] result=obj1.evenOdd(array);
        assertArrayEquals(arrResult,result);
    }
    /* Given input as integer array.
     If that array contain prime number then delete it and show remaining array. */
    @Test
    public void primeTest(){
        int[] result=obj1.primeTest(array);
        int[] arrResult={14,12};
        assertArrayEquals(arrResult,result);
    }
    /* Should return null when all elements are prime number.*/
    @Test
    public void allPrimeTest() {
        int[] array1={2,3,5};
        int[] arrResult1=null;
        int[] result1=obj1.primeTest(array1);
        assertArrayEquals(arrResult1,result1);
    }
    /* Reverse the given array */
    @Test
    public void reverseArray(){
        int[] arrResult={12,14,13};
        int[] result=obj1.reverseArr(array);
        assertArrayEquals(arrResult,result);
    }
}