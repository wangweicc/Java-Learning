package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的长：");
        double a = sc.nextDouble();
        System.out.println("请输入长方形的宽：");
        double b = sc.nextDouble();
        getLength(a,b);
    }
    public static void getLength(double a,double b){
        double result = 2 * (a + b);
        System.out.println("长方形的周长为："+result);
    }
}
