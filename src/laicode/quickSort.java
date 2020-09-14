package laicode;

class Solution {
    public int[] QuickSort(int[] array){
        if (array.length == 0 || array == null) {
            return array;
        }
        quickSort(array, 0, array.length - 1);
        return array;
    }
    private void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = partition(array, left, right);
        quickSort(array, left, pivot - 1);
        quickSort(array, pivot + 1, right);
        return;
    }
    private int partition(int[] array, int left, int right) {
        int random = (int) (left + Math.random() * (right - left + 1));
        int rightBound = right - 1;
        int leftBound = left;
        int r = array[random];
        swap(array, random, right);
        while (leftBound <= rightBound) {
            if (array[leftBound] < r) {
                leftBound++;
            } else if (array[rightBound] > r) {
                rightBound--;
            } else {
                swap(array, leftBound, rightBound);
            }
        }
        swap(array, leftBound, right);
        return leftBound;
    }
    private void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,3,5,1,2,8,90,1,2,3,4,5};
        Solution s = new Solution();
        int[] res = s.QuickSort(array);
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);
        }
    }
}