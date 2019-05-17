/*
 * Created by:Priyanka
 * Date:14/5/2019
 * This program is used to find out is vowel present in given string or not.
 * If found then remove it display only consonant.
 * If number is present in string then display error message.
 * If input is null then display error message.
 */
package com.stackroute.pe3;

public class VowelsChecking {
    public String removeVowels(String input) throws Exception {
        int index = 0;
        String output = "";
        int flag = 0;
        if (input == "") {
            output = "Input string cannot be null";
        }
        else{
            /* checks input contain number or not */
            for(int i=0;i<input.length();i++) {
                if (!(input.toUpperCase().charAt(i) >= 65 && input.toUpperCase().charAt(i) <= 90)) {
                    throw new Exception("Input string only contain characters");
                }
            }
            /* checks given string contains vowels or not */
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                    index++;
                }
            }
            if (index == 0) {
                return input;
            }
            else{
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                        flag = 1;
                    }
                    else{
                        output += input.charAt(i);
                        flag = 0;
                    }
                }
                return output;
            }
        }
        return output;
    }
}
