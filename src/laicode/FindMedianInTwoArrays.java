package laicode;

import java.util.Arrays;

public class FindMedianInTwoArrays {
    public double median(int[] a, int[] b){
        //assume a != null && b!= null;
        Arrays.sort(a);
        Arrays.sort(b);
        int k = a.length + b.length;
        if (k%2 == 1) {
            return Kth(a, b, k/2 + 1);
        } else {
            return (Kth(a, b, k/2) + Kth(a, b, k/2 + 1))/2;
        }
    }
    private int Kth(int[] a, int[] b, int k) {
        return Kth(a, 0, b, 0, k);
    }
    private int Kth(int[] a, int al, int[] b, int bl, int k) {
        if (al >= a.length) {
            return b[bl + k - 1];
        }
        if (bl >= b.length) {
            return a[al + k - 1];
        }
        if (k == 1) {
            return Math.min(a[al], b[bl]);
        }
        int am = al + k/2 - 1;
        int bm = bl + k/2 - 1;
        int av = al >= a.length ? Integer.MAX_VALUE : a[am];
        int bv = bl >= b.length ? Integer.MAX_VALUE : b[bm];
        if (av > bv) {
            return Kth(a, al, b, bm + 1, k - k/2);
        } else {
            return Kth(a, am + 1, b, bl, k - k/2);
        }
    }
}
