/*
 * Created by:Priyanka
 * Date:14/5/2019
 * This program is used to check that given grade of student is in between 0-100 then return true,
 * is greater than 100 then display number should be less than 100,
 * less than 0 then display number should be greater than 0.
 */
package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStudents;
        System.out.println("Enter the number of students:");
        numOfStudents = sc.nextInt();
        int[] grade = new int[numOfStudents];
        System.out.println("Enter the grades for " + numOfStudents + " students:");
        for (int i = 0; i < grade.length; i++) {
            int temp = sc.nextInt();
            grade[i]=temp;
        }
        String output[]=StudentMarks.testNumber(grade);
        for(int i=0;i<output.length;i++) {
            System.out.println(output[i]);
        }
    }

    public static String[] testNumber(int[] array)
    {
        String result[]=new String[array.length];
        for(int i=0;i<array.length;i++)
        {
            // checks number is lesser than zero or not
            if(array[i]<=0){
                result[i]="Input should be greater then 0";
            }
            // checks number is greater than zero or not
            else if(array[i]>100) {
                result[i]="Input should be smaller than 100";
            }
            // checks number is in between 0-100
            else if(array[i]>=0 && array[i]<=100){
                result[i]="true";
            }
        }
        return result;
    }
}
