package laicode;

public class IP1108 {
    public String defangIPaddr(String address) {
        char[] a = address.toCharArray();
        int i = 0;
        while (i < a.length) {
            if (a[i] == '.') {
                a[i] = '【';
                a[i+1] = '.';
                a[i+2] = ']';
                i = i+3;
            }
        }
        return new String(a);
    }
}
