package code;

import java.util.Scanner;

public class StringDemo1 {

    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);

        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4);
    }
}