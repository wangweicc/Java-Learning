package test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            count++;
            System.out.println("请输入你要猜的数字:");
            int guess = sc.nextInt();
            if (guess > n) {
                System.out.println("猜大了");
            }else if(guess < n){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
        System.out.println("你猜了" + count + "次");
    }
}
