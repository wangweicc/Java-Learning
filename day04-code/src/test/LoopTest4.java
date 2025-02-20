package test;

import java.util.Random;

public class LoopTest4 {
    public static void main(String[] args) {
        //打印10个1-100中的随机数
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(1,101);
            System.out.println(n);
        }
    }
}
