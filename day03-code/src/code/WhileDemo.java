package code;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        //需求：输入一个整数，打印1到这个整数之间的所有整数。
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数: ");
        int n = sc.nextInt();
        while(i <= n){
            System.out.print(i + " ");
            i++;
        }
    }
}
