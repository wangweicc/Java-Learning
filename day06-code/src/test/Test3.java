package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 假设输入的是两个整数
        System.out.println("请输入两个以空格分隔的整数：");
        if (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int num2 = scanner.nextInt();

                System.out.println("你输入的第一个数是：" + num1);
                System.out.println("你输入的第二个数是：" + num2);
            } else {
                System.out.println("请输入正确的整数格式！");
            }
        } else {
            System.out.println("请输入正确的整数格式！");
        }

        scanner.close();
    }
}