/*
 * Created by:Priyanka
 * Date:14/5/2019
 * This program is used to test that compare the two array elements or not,
 * remove duplicates from array or not,
 * append the array element and to prepend array element or not.
 */
package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayOperationsTest {
    ArrayOperations obj;
    @Before
    public void setUp()
    {
        //arrange
         obj=new ArrayOperations();
    }
    @After
    public void tearDown()
    {
        //arrange
        obj=null;
    }

    String[] arr1={"even","odd","prime"};
    String[] arr2={"true","false"};
    String[] arr3={"even","prime","odd"};
    /* If elements in both string array are not equal then display not equal */
    @Test
    public void compareArray() {
        String result=obj.compareArr(arr1,arr2);
        assertEquals("not equal",result);
    }
    /* If elements in both string array are equal then display equal. */
    @Test
    public void compareEqualArray() {
        String result=obj.compareArr(arr1,arr3);
        assertEquals("equal",result);
    }
    /* If array cntains duplicates element then delete that duplicate one and display remaining array.*/
    @Test
    public void removeDuplicates() {
        String[] array1={"even","even","odd"};
        String[] result={"even","odd"};
        String[] output=obj.removeDuplicate(array1);
        assertArrayEquals(result,output);
    }
    /* Append the first element of array 1 to array 2. */
    @Test
    public void appendElement(){
        String[] arrResult={"true","false","even"};
        String[] output=obj.append(arr1,arr2);
        assertArrayEquals(arrResult,output);
    }
    /* Prepend the middle element of array 2 to array 1. */
    @Test
    public void prependElement(){
        String[] arrResult={"odd","true","false"};
        String[] output=obj.prepend(arr2,arr1);
        assertArrayEquals(arrResult,output);

    }
}