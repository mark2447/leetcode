package laicode;

public class maopao {
    public int[] paixu(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        maopao m = new maopao();
        int[] res = m.paixu(new int[] {1,34,5,2,7,4,9,3});
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}

