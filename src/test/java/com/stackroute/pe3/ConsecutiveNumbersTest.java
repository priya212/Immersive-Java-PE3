/*
 * Created by:Priyanka
 * Date:14/5/2019
 * This program is used to test that given numbers in string are consecutive or not.
 */
package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers obj;
    @Before
    public void setUp(){
        //arrange
        obj=new ConsecutiveNumbers();
    }
    @After
    public void tearDown(){
        //arrange
        obj=null;
    }

    /* Input 98,96,95,94,93 should return "Non consecutive numbers" */
    @Test
    public void ifGivenStringIsNotConsecutiveReturnNonConsecutiveNumbers() {
        String array1="98,96,95,94,93";
        String outputExp="Non consecutive numbers";
        String result=obj.consecutiveNum(array1);
        assertEquals(outputExp,result);
    }
    /* Input 54,53,52,51,50,49,48 should return "consecutive numbers" */
    @Test
    public void ifGivenStringIsConsecutiveReturnConsecutiveNumbers() {
        String array1="54,53,52,51,50,49,48";
        String outputExp="Consecutive numbers";
        String result=obj.consecutiveNum(array1);
        assertEquals(outputExp,result);
    }
    /* Input 6,6,6,6,6,6 should return "non consecutive numbers" */
    @Test
    public void ifAllNumbersAreSameAlsoReturnNonConsecutiveNumbers() {
        String array1="6,6,6,6,6,6";
        String outputExp="Non consecutive numbers";
        String result=obj.consecutiveNum(array1);
        assertEquals(outputExp,result);
    }
    /* Input 0,-1,-2,-3,-4,-5 should return "consecutive numbers" */
    @Test
    public void ifNumbersAreNegativeButConsecutiveReturnConsecutiveNumber() {
        String array1="0,-1,-2,-3,-4,-5";
        String outputExp="Consecutive numbers";
        String result=obj.consecutiveNum(array1);
        assertEquals(outputExp,result);

    }
}