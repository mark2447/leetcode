package laicode.dynamicprogramming;

public class LongestAscendingSubsequenceII {
    public int[] longest(int[] a) {
        // Write your solution here;
        if (a == null || a.length == 0) {
            return a;
        }
        if (a.length == 0) return a;

        int n = a.length, max = 0;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    if (max < dp[i]) {
                        max = dp[i];
                    }
                }
            }
        }
        int[] res = new int[max];
        
        return dp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{10,11,1,2,12,4,3,5,0};
        LongestAscendingSubsequenceII l = new LongestAscendingSubsequenceII();
        int[] res = l.longest(a);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
