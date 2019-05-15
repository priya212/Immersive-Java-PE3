package com.stackroute.pe3;

public class ArrayOperations {

    public String compareArr(String[] array1,String[] array2)
    {
        String result="";
        int flag=0;
        if(array1.length==array2.length)
        {
            for(int i=0;i<array1.length;i++){
                for(int j=0;j<array2.length;j++)
                {
                    if(array1[i]==array2[j])
                    {
                        flag=1;
                        break;
                    }
                    else{
                        flag=0;
                    }
                }
            }
            if(flag==1)
            {
                result="equal";
            }
            else
            {
                result="not equal";
            }
        }
        else {
            result="not equal";
        }
        return result;
    }

    public String[] removeDuplicate(String[] array1){
        int count=0;
        int index=0;
        int index1=0;
        for(int i=0;i<array1.length-1;i++){
            for(int j=i+1;j<array1.length;j++) {
                if (array1[i] == array1[j]) {
                    count++;
                    break;
                }
            }
        }
        if(count==0)
        {
            return array1;
        }
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
                    else
                    {
                        index=0;
                    }
                }
                if(index1==0)
                {
                    output[index]+=array1[i];
                    index++;
                }
            }
            output[index]=array1[array1.length-1];
              return output;
        }


    }

    public String[] append(String[] array1,String[] array2)
    {
        String output[]=new String[array2.length+1];
        int index=0;
        for(int i=0;i<array2.length;i++)
        {
            output[index]=array2[i];
            index++;
        }
        String temp=array1[0];
        output[output.length-1]=temp;
        return output;
    }

    public String[] prepend(String[] array1,String[] array2)
    {
        String output[]=new String[array1.length+1];
        int index=0;
        String temp="";

        String element=array2[array2.length/2];

        output[0]=element;
        for(int i=0;i<array1.length;i++)
        {
            output[index+1]=array1[i];
            index++;
        }

        return output;
    }




}
