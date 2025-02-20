package test;

public class Test2 {
    public static void main(String[] args) {
        //定义一个方法，实现求四个季度的营业额之和
        int num1 = getSum(10, 20, 30);
        int num2 = getSum(30, 40, 50);
        int num3 = getSum(50, 60, 70);
        int num4 = getSum(70, 80, 90);
        int result = num1 + num2 + num3 + num4;
        System.out.println("四个季度的营业额之和为：" + result);
    }

    public static int getSum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
}
