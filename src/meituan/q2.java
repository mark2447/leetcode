package meituan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class q2 {
    public int price (int num, int[] start, int[] end) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < start.length; i++) {
            map.put(start[i], i);
        }
        int price = 0;
        for (int j = 0; j < end.length; j++) {
            for (int x = j + 1; x < end.length; x++) {
                if (map.get(end[j]) > map.get(end[x])) {
                    price++;
                    break;
                }
            }
        }
        return price;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String s1 = sc.nextLine();
        String[] s11 = s1.split(" ");
        String s2 = sc.nextLine();
        String[] s22 = s2.split(" ");
        int[] start = new int[s11.length];
        for (int i = 0; i < s11.length; i++) {
            start[i] = Integer.parseInt(s11[i]);
        }
        int[] end = new int[s22.length];
        for (int i = 0; i < s22.length; i++) {
            end[i] = Integer.parseInt(s22[i]);
        }
        q2 q = new q2();
        int price = q.price(num, start, end);
        System.out.println(price);
    }
}