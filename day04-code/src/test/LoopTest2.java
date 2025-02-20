package test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        //键盘录入一个正整数，若该数的平方根为整数，则输出该数的平方根，否则输出该数的平方根
        //在哪两个整数之间
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = sc.nextInt();
        int i = 0;
        while(i * i <= n){
            i++;
        }
        if((i - 1) * (i - 1) == n){
            System.out.println("n的平方根为" + (i - 1));
        }else{
            System.out.println("n的平方根在" + (i - 1) + "和" + i + "之间");
        }
    }
}
