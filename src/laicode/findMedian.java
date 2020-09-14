package laicode;

import java.util.Arrays;

public class findMedian {
    public double median(int[] a, int[] b) {
        //assume a, b are not null and have at least one element
        int la = a.length;
        int lb = b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        int len = la + lb;
        if (len % 2 == 1) {
            return findKth(a, b, 0, 0, (len + 1)/2);
        } else {
            return (findKth(a, b, 0, 0, len / 2) + findKth(a, b, 0, 0, len / 2 + 1)) / 2.0;
        }
    }
    private double findKth(int[] a, int[] b, int aLeft, int bLeft, int k) {
        if (aLeft > a.length) {
            return b[bLeft + k - 1];
        }
        if (bLeft > b.length) {
            return a[aLeft + k - 1];
        }
        if (k == 1) {
            return Math.min(a[aLeft], b[bLeft]);
        }
        int amid = aLeft + k/2 - 1;
        int bmid = bLeft + k/2 - 1;
        int am = amid >= a.length ? Integer.MAX_VALUE : a[amid];
        int bm = bmid >= b.length ? Integer.MAX_VALUE : b[bmid];
        if (am > bm) {
            return findKth(a, b, aLeft, bmid + 1, k - k/2);
        } else {
            return findKth(a, b, amid + 1, bLeft, k - k/2);
        }
    }
}
