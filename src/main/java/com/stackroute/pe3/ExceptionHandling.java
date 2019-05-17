/*
 * Created by:Priyanka
 * Date:14/5/2019
 * This program is used to throw an exception and handle it.
 */
package com.stackroute.pe3;

public class ExceptionHandling {

    public static String exceptionChecking(String[] array) {
        /* As given length is negative throw negative array index exception */
        try {
            if (array.length < 0) {
                System.out.println(array.length);
            }
        }
        catch (NegativeArraySizeException e) {
            throw new NegativeArraySizeException("Negative Array Index Exception");
        }
        /* As given array index is not present throw array index out of bound exception */
        try {
            for(int i=array.length;i>=0;i++) {
                System.out.println(array[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Array Index Out Of Bound Exception");
        }
        /* As array is null and printing array length throw null pointer Exception */
        try{
            if(array==null) {
                System.out.println(array.length);
            }
        }
        catch (NullPointerException e) {
            throw new NullPointerException("Null Pointer Exception");
        }
        return null;
    }
}
