package kuaishou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question1 {
    public int[] DistanceToHigher (int[] height) {
        // write code here
        if (height == null || height.length == 0) {
            return height;
        }
        int[] res = new int[height.length];
        res[0] = 0;
        for (int i = 1; i < height.length; i++) {
            // 175, 179, 174, 163, 176, 177
            // 0, 0, 1, 1, 2, 4
            for (int j = i - 1; j >= 0; j--) {
                if (height[j] > height[i]) {
                    res[i] = i - j;
                    break;
                } else {
                    res[i] = 0;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            list.add(n);
        }
        int[] height = new int[list.size()];
        for (int j = 0; j < height.length; j++) {
            height[j] = list.get(j);
        }
        question1 q1 = new question1();
        int[] res = q1.DistanceToHigher(height);
        for (int x : res) {
            System.out.println(x);
        }
        }

    }

