package code;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<User>();
        User u1 = new User("001", "zhangsan", "123456");
        User u2 = new User("002", "lisi", "12345678");
        User u3 = new User("003", "wangwu", "123456qwer");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        boolean flag = contains(list, "001");
        System.out.println(flag);
    }

    public static boolean contains(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (id.equals(uid)) {
                return true;
            }
        }
        return false;
    }
}
