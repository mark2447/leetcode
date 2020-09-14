package laicode;

public class laicode22 {
    public int search(int[] array, int target) {
        // Write your solution here
        int left = 0;
        int right = array.length - 1;
        if (array == null || array.length == 0) {
            return -1;
        }
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[left] <= array[mid]) {
                if (target>=array[left] && left <= array[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target>= array[mid] && target <= array[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        laicode22 lc = new laicode22();
        int[] a = {1,1,3,3,3,3,4,4};
        int res = lc.search(a, 3);
        System.out.println(res);
    }
}
