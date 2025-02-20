package code;

public class SkipLoopDemo2 {
    public static void main(String[] args) {
        //2.结束整个循环
        //有5个包子，小老虎吃了3个，就不吃了。
        for(int i = 1; i <= 5; i++){
            if(i > 3){
                break; //结束整个循环
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
    }
}
