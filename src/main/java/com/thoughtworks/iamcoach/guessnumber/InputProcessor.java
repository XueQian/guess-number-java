package com.thoughtworks.iamcoach.guessnumber;

import java.util.Scanner;

public class InputProcessor {
    public String process(){

        Scanner input = new Scanner(System.in);

        return isCorrectString(input.next());

    }

    private String isCorrectString(String string){

        for(int i=0;i<string.length();i++){
            if(!java.lang.Character.isDigit(string.charAt(i))){
                string=" 请输入整数";
            }
        }
        return string;
    }
}
