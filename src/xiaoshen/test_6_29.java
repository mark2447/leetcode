package xiaoshen;

import java.util.Scanner;
// bug -- debug
public class test_6_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l;
        double d;
        double h;
        // 1 2 3
        if (sc.hasNext()) {
            l = sc.nextDouble();
            System.out.println(l);
            d = sc.nextDouble();
            System.out.println(d);
            h = sc.nextDouble();
            System.out.println(h);

            Calculator calculator = new Calculator();
            double s = calculator.computeTriangle(l, d, h);
            if (s == -999) {
                System.out.println("请重新输入");
            }
            System.out.println("三角形面积是" + s);
        }
    }
}
