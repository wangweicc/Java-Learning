package code;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {
        //1. & | 无论左边true还是false，右边都要执行
        //2. && || 左边为true，右边不执行
        //3. 逻辑与：无论左边true还是false，右边都要执行
        //4. 逻辑或：无论左边true还是false，右边都要执行

        int a = 10;
        int b = 10;
        boolean result1 = ++a < 5 & ++b < 5;
        System.out.println(result1);
        System.out.println(a);
        System.out.println(b);

        //5. 短路与：左边为false，右边不执行
        //6. 短路或：左边为true，右边不执行
        int c = 10;
        int d = 10;
        boolean result2 = ++c < 5 && ++d < 5;
        System.out.println(result2);
        System.out.println(c);
        System.out.println(d);
    }
}
