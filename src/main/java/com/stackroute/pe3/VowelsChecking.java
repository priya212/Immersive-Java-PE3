package com.stackroute.pe3;

import java.sql.SQLOutput;

public class VowelsChecking {

    public String removeVowels(String input) throws Exception {
        int index = 0;
        String output = "";
        int flag = 0;


            if (input == "") {
                output = "Input string cannot be null";
            } else {
                for(int i=0;i<input.length();i++) {

                        if (!(input.toUpperCase().charAt(i) >= 65 && input.toUpperCase().charAt(i) <= 90)) {
                            throw new Exception("Input string only contain characters");
                        }

                }
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                        index++;
                    }
                }
                if (index == 0) {
                    return input;
                } else {
                    for (int i = 0; i < input.length(); i++) {
                        if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                            flag = 1;
                        } else {
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
