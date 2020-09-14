package laicode;

public class SquareRootI {
    public static int sqrt(int x) {
        // Write your solution here
        if (x < 2) {
            return x;
        }
        if (x == 0) return 0;
        int start = 1, end = x;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1))// Found the result
                return mid;
            else if (mid > x / mid)// Keep checking the left part
                end = mid;
            else
                start = mid + 1;// Keep checking the right part
        }
        return start;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            System.out.println(String.format("数字%d的平方根是: %d", i, SquareRootI.sqrt(i)));
        }
    }
}
