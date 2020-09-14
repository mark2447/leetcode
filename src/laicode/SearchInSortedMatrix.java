package laicode;

public class SearchInSortedMatrix {
    public int[] search(int[][] matrix, int target) {
        // Write your solution here
        if (matrix == null || matrix.length == 0) {
            return new int[]{-1, -1};
        }
        int r = matrix.length;
        int c = matrix[0].length;
        int left = 0;
        int right = r * c - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            int midr = mid/c;
            int midc = mid%c;
            int midv = matrix[midr][midc];
            if (target == midv) {
                return new int[]{midr, midc};
            } else if (target < midv) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}
