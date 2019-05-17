/*
 * Created by:Priyanka
 * Date:14/5/2019
 * This program is used to test that given grade of student is in between 0-100 then return true,
 * is greater than 100 then display number should be less than 100,
 * less than 0 then display number should be greater than 0.
 */
package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks obj;
    @Before
    public void setUp() {
        //arrange
        obj=new StudentMarks();
    }
    @After
    public void tearDown() {
        //arrange
        obj=null;
    }

    int[] numbers={12,-1,105};
    /*Given a number between 0 to 100 Should return true.
     * Given a number greater than 100 should return an error message "Input should be less than 100".
     * Given a number lesser than 0 should return an error message "Input should be greater than 0".*/
    @Test
    public void testNum() {
        String[] expResult={"true","Input should be greater then 0","Input should be smaller than 100"};
        String[] output=obj.testNumber(numbers);
        assertArrayEquals(expResult,output);
    }
}