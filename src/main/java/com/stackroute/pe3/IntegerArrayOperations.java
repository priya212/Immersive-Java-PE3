/*
 * Created by:Priyanka
 * Date:14/5/2019
 * This program is used to check that numbers from array are even or odd,
 * if given array contain prime number then delete it and display remaining numbers,
 * and reverse the given array.
 */
package com.stackroute.pe3;

public class IntegerArrayOperations {
    /* check that numbers from array are even or odd */
    public String[] evenOdd(int[] numbers){
        String[] result=new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0) {
                result[i]="even";
            }
            else {
                result[i]="odd";
            }
        }
        return result;
    }
    /* array contain prime number then delete it and display remaining numbers */
    public int[] primeTest(int[] numbers){
        int index=0;
        int count=0;
        for(int i=0;i<numbers.length;i++) {
            for(int j=2;j<numbers[i]-1;j++) {
                if(numbers[i]%j==0) {
                    count++;
                    break;
                }
            }
        }
        int[] result=new int[count];
        if(count==numbers.length) {
            return numbers;
        }
        else if(count==0) {
            return null;
        }
        else{
            for(int i=0;i<numbers.length;i++) {
                for(int j=2;j<numbers[i]-1;j++) {
                    if(numbers[i]%j==0) {
                        result[index]=numbers[i];
                        index++;
                        break;
                    }
                }
            }
            return result;
        }
    }
    /* reverse the given array */
    public int[] reverseArr(int[] numbers){
        int index=0;
        int result[]=new int[numbers.length];
        for(int i=numbers.length-1 ; i >= 0 ; i--) {
            result[index]+=numbers[i];
            index++;
        }
        return  result;
    }
}