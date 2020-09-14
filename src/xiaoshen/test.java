package xiaoshen;

public class test {

    public static void main(String[] args) {
        //new 是创建一个对象，它自动调用类的构造方法
        //大写表示类--抽象的概念，小写表示我已经创建好的实体
//        Car car = new Car("粉红色",10000000, "保时捷");
        Driver Freya = new Driver("小沈",16, new Car("粉红色啊啊啊啊",10000000, "保时捷"));
//        System.out.println(Freya.name + " have a " + Freya.car.brand);
//        Freya.drive();
        System.out.println(Freya.car.color);
    }
}
