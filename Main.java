package com.tts;

public class Main {

    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        String str = "myString";
        double d = .1234;
        double  result = (f*b) +(i/c) - (d *s);
        System.out.println("result = "+result);
       c = str;
    }
}
