/*
 * Created by:Priyanka
 * Date:14/5/2019
 * This program is used to find that given numbers in string are consecutive or not.
 */
package com.stackroute.pe3;

import java.util.Arrays;

public class ConsecutiveNumbers {
    public String consecutiveNum(String input) {
        String[] temp=input.split(",");
        int[] number=new int[temp.length];
        for(int i=0;i<number.length;i++) {
            number[i]=Integer.parseInt(temp[i]);
        }
        Arrays.sort(number);
        String output="";
        boolean flag=false;
        /* Checks whether the numbers are consecutive or not */
        for(int i=0;i<number.length-1;i++) {
                if ((number[i+1]-number[i]) ==1) {
                    flag=true;
                } else {
                    flag=false;
                    break;
                }
        }
        if(flag==true) {
            output="Consecutive numbers";
        }
        else{
            output="Non consecutive numbers";
        }
        return  output;
    }
}
