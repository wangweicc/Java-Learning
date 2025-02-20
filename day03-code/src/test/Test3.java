package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //判断一个整数是否是回文数
        //回文数：正着读和倒着读都一样的数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        int t = n;
        int num = 0;
        while(n != 0){
            int ge = n % 10;
            num = num * 10 + ge;
            n = n / 10;
        }
        System.out.println(num);
        if(num == t){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
         }
    }
}
