package code;

//数组：是一种容器，可以用来存储同种类型的多个数据值
//数组的定义格式：
//数据类型[] 数组名;    推荐使用
//数据类型 数组名[];

//数组的初始化：
//动态初始化：初始化时只指定数组长度，由系统为数组分配初始值
//数据类型[] 数组名 = new 数据类型[数组长度];
//数组长度其实就是数组中元素的个数
//动态初始化也可以拆分为两个步骤：
//数据类型[] 数组名;
//数组名 = new 数据类型[数组长度];
//静态初始化：初始化时指定每个数组元素的初始值，由系统决定数组长度
//数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3...};
//简化格式：
//数据类型[] 数组名 = {元素1,元素2,元素3...};

//数组操作的两个常见问题：
//索引越界：访问了数组中不存在的索引对应的元素，造成索引越界问题
//空指针异常：访问的数组已经不再指向堆内存的数据，造成空指针异常

//注意事项：
//静态初始化没有直接指定长度，但是仍然会自动推算出长度
//动态初始化也没有直接指定长度，但是仍然会自动推算出长度
//静态初始化可以简化，但是动态初始化不能简化
//数组一旦创建，程序运行期间，长度不可改变


//int类型的数组容器（byte short int）
//double类型的数组容器（byte short int long float double）
//char类型的数组容器（byte short int long float double char）

//public class ArrayDemo1 {
//    public static void main(String[] args) {
//
//    }
//}

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
