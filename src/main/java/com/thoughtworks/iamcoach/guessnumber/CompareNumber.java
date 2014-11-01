package com.thoughtworks.iamcoach.guessnumber;

public class CompareNumber {
    public String compare(String input,String answer) {
        int a = 0;
        int b = 0;
        for (int i = 0;i<answer.length();i++) {
            if (input.charAt(i) == answer.charAt(i)) {
                a++;
            }
            if (answer.contains(String.valueOf(input.charAt(i)))) {
                b++;
            }
        }
        return a+"A"+(b-a)+"B";
    }
}
