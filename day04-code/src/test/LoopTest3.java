package test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        //键盘录入一个整数x，判断该整数是否为一个质数
        //质数：大于1的自然数中，除了1和它本身以外不再有其他因数的自然数
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for x: ");
        int x = sc.nextInt();
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println(x + "是质数");
        }else{
            System.out.println(x + "不是质数");
        }
    }
}
