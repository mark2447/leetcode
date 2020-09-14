package meituan;

import java.util.Scanner;

/*
* 作为一个程序员，修bug（补漏洞）是一项基本的工作。当你刚刚完成一个工作的时候，甲方说你的程序里面有n个bug。

但是你已经很累了，你希望第一天修x个bug,第二天修[x/k]个bug，第三天修[x/k2]个bug，以此类推，第n天修⌊x/k^(n-1) ⌋个bug，直到修不了bug为止。

[x]的意思是x向下取整。在k大于1的时候，总有一天会修不了一个bug的。所以，你希望在这一天来临之前，修完所有的bug。你要计算，
* 你第一次至少要修多少个bug，即x的最小值为多少。*/
public class q3 {
    public int num(int bug, int k) {
        int min = Integer.MAX_VALUE;
        for (int i = bug; i > bug/2; i--) {
            if (canfix(bug, i, k)) {
                min = Math.min(min, i);
            }
        }
        return min;
    }
    public boolean canfix(int bug, int num, int k) {
        double di = num;
        double dk = k;
//        double day = ((Math.log(dk))/(Math.log(di))) + 1;
//        int dd = (int) day;
        double n = 0;
        int sum = 0;
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            n = num / Math.pow(k, i);
//            if (n < 1) {
//                break;
//            }
//            sum += num / Math.pow(k, i);
//        }
        if (sum >= bug) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split(" ");
        int bug = Integer.parseInt(a[0]);
        int k = Integer.parseInt(a[1]);
        q3 q = new q3();
        System.out.println(q.num(bug, k));
    }
}
