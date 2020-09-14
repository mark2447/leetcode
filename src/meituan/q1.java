package meituan;
/*输入包含三行

第一行一个正整数x，表示今天是周x。(1<=x<=7)

第二行是一个24小时制的时间表示，时和分均含前导0，例如，1时1分表示为01:01。保证时间格式是合法的。

第三行是一个正整数n，表示要求的是n分钟之前的时间。(1<=n<=10^9)
输出同样包含两行，第一行仅包含一个正整数，表示n分钟之前是周几。

一个24小时制的时间表示，时和分均含前导0，例如，1时1分表示为01:01。表示n分钟之前的时刻。*/

import java.util.Scanner;

public class q1 {
    public String[] time(int day, int timenow, int num) {
        int dif = timenow - num;
        int newhour = 0;
        int newmin = 0;

        if (dif < 0) {
            day--;
            dif = dif * (-1);
            int hour = dif / 60;
            while (hour >= 24) {
                day--;
                hour = hour - 24;
            }
            int min = dif % 60;
            newhour = 23 - hour;
            newmin = 60 - min;
            if (newmin == 60) {
                newhour++;
                newmin = 0;
            }
            if (day < 0) {
                while (day < 0) {
                    day = day+7;
                }
            }
            if (day == 0) {
                day = 7;
            }
        } else {
            newhour = dif / 60;
            newmin = dif % 60;
        }
        StringBuilder sb1 = new StringBuilder();
        if (newhour < 10) {
            sb1.append(0);
            sb1.append(newhour);
        } else {
            sb1.append(newhour);
        }
        sb1.append(":");
        String nh = sb1.toString();
        StringBuilder sb2 = new StringBuilder();
        if (newmin < 10) {
            sb1.append(0);
            sb1.append(newmin);
        } else {
            sb1.append(newmin);
        }
        String nm = sb2.toString();
        sb1.append(sb2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(day);
        String[] r = new String[2];
        r[0] = sb3.toString();
        r[1] = sb1.toString();
        return r;
    }
    public int process(String time) {
        String[] s = time.split(":", 2);
        int t1 = Integer.parseInt(s[0]);
        int t2 = Integer.parseInt(s[1]);
        int total = t1 * 60 + t2 * 1;
//        System.out.println(t1);
//        System.out.println(t2);
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = Integer.parseInt(sc.nextLine());
        String timenow = sc.nextLine();
        int num = Integer.parseInt(sc.nextLine());
        q1 q = new q1();
        int time2 = q.process(timenow);
        String[] res = q.time(day, time2, num);
        for (String s : res) {
            System.out.println(s);
        }
    }
}
