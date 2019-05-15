package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerArrayOperationsTest {
    IntegerArrayOperations obj1=new IntegerArrayOperations();
    int[] array={13,14,12};
    @Test
    public void evenOddTestCases(){
        int[] array={15,14,12};
        String[] arrResult={"odd","even","even"};

        String[] result=obj1.evenOdd(array);
        assertArrayEquals(arrResult,result);

    }
    @Test
    public void primeTest(){
        int[] result=obj1.primeTest(array);
        int[] arrResult={14,12};
        assertArrayEquals(arrResult,result);
    }
    @Test
    public void allPrimeTest()
    {
        int[] array1={2,3,5};
        int[] arrResult1=null;
        int[] result1=obj1.primeTest(array1);
        assertArrayEquals(arrResult1,result1);

    }
    @Test
    public void reverseArray(){
        int[] arrResult={12,14,13};
        int[] result=obj1.reverseArr(array);
        assertArrayEquals(arrResult,result);


    }

}