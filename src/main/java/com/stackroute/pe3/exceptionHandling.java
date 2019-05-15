package com.stackroute.pe3;

public class exceptionHandling {

    public static String exceptionChecking(String[] array) {
        if(array.length<0)
        {
            throw new NegativeArraySizeException("Negative Array Index Exception");
        }

        if(array[array.length]=="5")
        {
            throw new ArrayIndexOutOfBoundsException("Array Index Out Of Bound Exception");
        }
        if(array==null)
        {
            throw new NullPointerException("Null Pointer Exception");
        }
        return null;
    }
}
