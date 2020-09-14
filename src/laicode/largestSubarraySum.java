package laicode;

public class largestSubarraySum {
    public int[] largestSum(int[] array) {
        // Write your solution here
        int globalMax = array[0];
        int[] dp = new int[array.length + 1];
        dp[0] = array[0];
        int left = 0;
        int right = 0;
        int globalLeft = 0;
        int globalRight = 0;
        for (int i = 1; i < array.length; i++) {
            if (dp[i-1] > 0) {
                dp[i] = dp[i-1] + array[i];
                right = i;
                System.out.println(right);
            } else {
                dp[i] = array[i];
                left = i;
                System.out.println(left);
            }
            if (dp[i] > globalMax) {
                globalMax = dp[i];
                globalLeft = left;
                System.out.println("globalLEft =" + globalLeft);
                globalRight = right;
                System.out.println("globalRight =" + globalRight);
            }
        }
        return new int[] {globalMax, globalLeft, globalRight < globalLeft ? globalLeft : globalRight};
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,-2,3};
        largestSubarraySum s = new largestSubarraySum();
        int[] res = s.largestSum(array);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
