package xiaoshen;//package xiaoshen;
//
//public class Car {
//    public String color;
//    public String brand;
//    public Car(String color, String brand) {
//        this.color = color;
//        this.brand = brand;
//    }
//}
//


//public -- 权限修饰符, private, protect, final
//public -- 我这个类能够被我其他文件夹，所有文件夹访问
//private -- 就任何人都不能访问
//基本数据类型-- 形容描述我们的属性的
//boolean，int--integer，long -- long integer, double, float，byte, char
public class Car {
    //定义类的属性
    public String color;
    //文字，字符，都是属于string
    //单个字符 char--character
    //String是多个char连在一起
    public double price;
    public String brand;
    //啊啊啊啊
    //0 1 2 3
    //一个类必须要的一个方法--构造方法--我们把类里的元素都组装起来
    Car(String color, double Price, String brand) {
        this.color = color.substring(0,3);
        this.price = price;
        this.brand = brand;
    }
}