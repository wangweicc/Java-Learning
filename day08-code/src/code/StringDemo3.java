package code;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        String rightUsername = "zhangsan";
        String rightPassword = "123456";
        int count = 0;
        while(true) {
            count = count + 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            if(username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("用户登录成功！");
                break;
            }else {
                if((3 - count) > 0) {
                    System.out.println("用户登录失败，用户名或密码有误，还有" + (3 - count) + "次机会。");
                }
                else {
                    System.out.println("错误次数达到上限，账号已被锁定！");
                    break;
                }
            }
        }

    }
}
