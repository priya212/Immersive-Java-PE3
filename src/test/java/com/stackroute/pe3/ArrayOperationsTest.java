package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTest {
     ArrayOperations obj=new ArrayOperations();
    String[] arr1={"even","odd","prime"};
    String[] arr2={"true","false"};
    String[] arr3={"even","prime","odd"};

    @Test
    public void compareArray()
    {
        String result=obj.compareArr(arr1,arr2);
        assertEquals("not equal",result);

    }
    @Test
    public void compareEqualArray()
    {

        String result=obj.compareArr(arr1,arr3);
        assertEquals("equal",result);
    }
    @Test
    public void removeDuplicates()
    {
        String[] array1={"even","even","odd"};
        String[] result={"even","odd"};
        String[] output=obj.removeDuplicate(array1);
        assertArrayEquals(result,output);
    }

    @Test
    public void appendElement(){
        String[] arrResult={"true","false","even"};
        String[] output=obj.append(arr1,arr2);
        assertArrayEquals(arrResult,output);

    }
    @Test
    public void prependElement(){
        String[] arrResult={"odd","true","false"};
        String[] output=obj.prepend(arr2,arr1);
        assertArrayEquals(arrResult,output);

    }


}