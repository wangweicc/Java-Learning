package code;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        //1.跳过某一次循环
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue; //跳过本次循环，继续下次循环
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
    }
}
