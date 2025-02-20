package code;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        //逻辑异或
        //相同为false，不同为true
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        //逻辑非
        System.out.println(!false);
        System.out.println(!true);
    }
}
