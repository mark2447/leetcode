package laicode;

public class laicode90 {
    public int minJump(int[] array) {
        // Write your solution here
        int[] dp = new int[array.length];
        //dp表示我们从i跳出到数组之外所需要的最小的步数
        for(int i = dp.length - 1; i >=0; i--) {
            dp[i] = -1;
            for (int j = i+1; j < dp.length; j++) {
                if (dp[i] == -1 || dp[j] != -1 && i + array[i] >= j) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int[] array = {4,2,1,3,2,1,1,0};
        laicode90 lai = new laicode90();
        int res = lai.minJump(array);
        System.out.println(res);
    }
}
