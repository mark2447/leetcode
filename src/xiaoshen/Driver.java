//package xiaoshen;
//
//public class Driver {
//    public String name;
//    public int age;
//    Car car;
//    public Driver(String name, int age, Car car) {
//        this.name = name;
//        this.age = age;
//        this.car = car;
//    }
//    public void drive() {
//        System.out.println(name + " is driving a " + car.brand);
//    }
//}
package xiaoshen;
//一个类，有成员变量，有成员方法，还有构造方法
public class Driver{
    //属性--成员变量
    public String name;
    public int age;
    public Car car;
    //构造方法，每一个类都要写的哦
    public Driver(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    //成员方法
    public void drive() {
        if (age < 18) {
            System.out.println("you are under age, u cannot drive");
        } else {
            System.out.println(name + " is driving a" + car.brand);
        }
    }
}
