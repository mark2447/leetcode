package xiaoshen;

public class Calculator {
    //一个变量只需要声明一次类型而且必须声明一次类型除非它不是变量
    // 1, 1.0
    public double add(double x, double y){
        double result = x + y;
        return result;
    }

    public double computeTriangle(double l, double d, double h) {
        if (l + d <= h || l + h <= d || h + d <= l) {
            System.out.println("错误， 无法构成三角形");
            return -999;
        }

        double p = 1.0/2.0 * (l+d+h);
        //  1/2 = 0;  "/" 在java是意味着整除，不会有小数
        System.out.println("p = " + p);
        double s = Math.sqrt(p * (p-l) * (p-d) * (p-h));
        return s;



// s = 根号下（p(p-a)(p-b)(p-c)） p = 1/2（a+b+c）
    }





    public Driver getdriver(String name) {
        Driver driver = new Driver(name, 18, new Car("红色", 19999, "红旗"));
        return driver;
    }
}




//void double int String Driver
//方法
// public 权限修饰符 + 方法返回值的修饰符 + 方法名 （输入参数1，输入参数2）{
      //方法的执行部分，也就是逻辑部分
// }
//void --不需要返回值