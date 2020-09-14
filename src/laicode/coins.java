package laicode;

import java.util.ArrayList;
import java.util.List;

public class coins {
    public List<List<Integer>> combinations(int target, int[] coins) {
        // Write your solution here
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<>();
        helper(target, coins, res, cur, 0);
        return res;
    }
    private void helper(int target, int[] coins, List<List<Integer>> res, List<Integer> cur, int level) {
        if (level >= coins.length) {
            return;
        }
        int coin = coins[level];
        if (target % coin == 0) {
            cur.add(target/coin);
            res.add(cur);
        }
        int canAdd = target/coin;
        for (int i = 0; i <= canAdd; i++) {
            cur.add(i);
            helper(target - i*coin, coins, res, cur, level+1);
            cur.remove(cur.size() - 1);
        }
    }

    public static void main(String[] args) {
        coins c = new coins();
        List<List<Integer>> res = c.combinations(10, new int[] {34,31,29,16,2});
        System.out.println(res);
    }
}
