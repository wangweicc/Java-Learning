package code;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student stu = new Student();
            System.out.println("请输入学生的姓名：");
            String name = sc.next();
            System.out.println("请输入学生的年龄：");
            int age = sc.nextInt();
            stu.setName(name);
            stu.setAge(age);
            list.add(stu);
        }
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + " " + s.getAge());
        }
    }
}
