package ColumbiaUniversity;

import bytedance.QuickSort;

public class COMS4156 {
	public int[] quickSort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        quickSort(0, array.length - 1, array);
        return array;
    }
    private void quickSort(int left, int right, int[] array) {
        if (left >= right) {
            return;
        }
        int index = partition(left, right, array);
        quickSort(left, index - 1, array);
        quickSort(index + 1, right, array);
    }

    private int partition(int left, int right, int[] array) {
        int random = left + (int)(Math.random()) * (right - left + 1);
        int value = array[random];
        int rightBound = right - 1;
        int leftBound = left;
        swap(random, right, array);
        while (leftBound <= rightBound) {
            if (array[leftBound] <= value) {
                leftBound++;
            } else if (array[rightBound] > value) {
                rightBound--;
            } else {
                swap(leftBound, rightBound, array);
            }
        }
        swap(leftBound, right, array);
        return leftBound;
    }

    private void swap(int random, int right, int[] array) {
        int t = array[random];
        array[random] = array[right];
        array[right] = t;
    }

    public static void main(String[] args) {
        int[] array = {3,4,6,2,4,8,667,234,12,6787,3,0,4};
        System.out.println("123123123*****");
        QuickSort quickSort = new QuickSort();
        int[] res = quickSort.quickSort(array);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
