package laicode;

import java.util.HashSet;
import java.util.Set;

public class lai323depthofforest {
    public int depth(int[] forest) {
        // Write your solution here
        if (forest == null || forest.length == 0) {
            return Integer.MIN_VALUE;
        }


        int max = 0;
        for (int i = 0; i < forest.length; i++) {
            Set<Integer> set = new HashSet<>();
            int count = 1;
            int cur = i;
            for (; forest[cur] != -1 && !set.contains(cur); cur = forest[cur]) {
                count++;
                set.add(cur);
            }
            System.out.println(cur);
            if (forest[cur] != -1) {
                return -1;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] forest = new int[]{-1,0,1,2,3,4,5};
        lai323depthofforest lai = new lai323depthofforest();
        int res = lai.depth(forest);
        System.out.println(res);
    }
}
