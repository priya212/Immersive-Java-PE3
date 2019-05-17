/*
 * Created by:Priyanka
 * Date:14/5/2019
 * This program is used to compare the two array elements,
 * remove duplicates from array,
 * append the array element and to prepend array element.
 */
package com.stackroute.pe3;

public class ArrayOperations {
    /* This method is used to compare two array elements */
    public String compareArr(String[] array1,String[] array2) {
        String result="";
        int flag=0;
        /* This loop used to check that if length both array is same then only it will compares elements in array */
        if(array1.length==array2.length) {
            for(int i=0;i<array1.length;i++){
                for(int j=0;j<array2.length;j++) {
                    if(array1[i]==array2[j]) {
                        flag=1;
                        break;
                    }
                    else{
                        flag=0;
                    }
                }
            }
            if(flag==1) {
                result="equal";
            }
            else {
                result="not equal";
            }
        }
        else {
            result="not equal";
        }
        return result;
    }
    /* This method is used to remove duplicate array element from given array */
    public String[] removeDuplicate(String[] array1){
        int count=0;
        int index=0;
        int index1=0;
        /* This loop check how many duplicate values present in given array */
        for(int i=0;i<array1.length-1;i++){
            for(int j=i+1;j<array1.length;j++) {
                if (array1[i] == array1[j]) {
                    count++;
                    break;
                }
            }
        }
        if(count==0) {
            return array1;
        }
        /* Removes the duplicate elements from array */
        else{
            String[] output=new String[array1.length-count];
            for(int i=0;i<output.length;i++){
                output[i]="";
            }
            for(int i=0;i<array1.length-1;i++){
                for(int j=i+1;j<array1.length;j++) {
                    if (array1[i] == array1[j]) {
                        index=1;
                        break;
                    }
                    else{
                        index=0;
                    }
                }
                if(index1==0) {
                    output[index]+=array1[i];
                    index++;
                }
            }
            output[index]=array1[array1.length-1];
              return output;
        }
    }
    /* This method is used to append the array element to another array */
    public String[] append(String[] array1,String[] array2) {
        String output[]=new String[array2.length+1];
        int index=0;
        for(int i=0;i<array2.length;i++) {
            output[index]=array2[i];
            index++;
        }
        String temp=array1[0];
        output[output.length-1]=temp;
        return output;
    }
    /* This method is used to prepend the array element to another array */
    public String[] prepend(String[] array1,String[] array2) {
        String output[]=new String[array1.length+1];
        int index=0;
        String temp="";
        String element=array2[array2.length/2];
        output[0]=element;
        for(int i=0;i<array1.length;i++) {
            output[index+1]=array1[i];
            index++;
        }
        return output;
    }
}
