package kuaishou;



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main{
    public class Phone {
        int baozi;
        int shunzi;
        String number;
        Phone (String number, int baozi, int shunzi){
            this.number = number;
            this.baozi = baozi;
            this.shunzi = shunzi;
        }
    }
    public String findBeauty(String input) {
        if (input == null || input.length() == 0) {
            return null;
        }
        List<String> list = Arrays.asList(input.split(","));
        Phone[] phones = new Phone[list.size()];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String s : list) {
            phones[i] = new Phone(s, getbaozi(s), getshunzi(s));
            i++;
        }
        Arrays.sort(phones, new myComparator());
        for (Phone p : phones) {
            sb.append(p.number + ",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    public class myComparator implements Comparator<Phone>{

        @Override
        public int compare(Phone p1, Phone p2) {
            int pa = Math.max(p1.baozi, p1.shunzi);
            int pb = Math.max(p2.baozi, p2.shunzi);
            if (pa != pb) {
                return pa > pb ? -1 : 1;
            } else if (pa == p1.baozi && pb == p2.baozi) {
                return 0;
            } else if (pa == p1.shunzi && pb == p2.baozi) {
                return 1;
            } else if (pa == p1.baozi && pb == p2.shunzi) {
                return -1;
            } else {
                return 0;
            }
        }
    }
    public int getbaozi(String s) {
        char[] array = s.toCharArray();
        int cur = 1;
        int max = 0;
        for (int i = 3; i < array.length - 1; i++) {

            int j = (int)array[i + 1];
            if (j == (int)array[i]) {
                cur++;
            } else {
                cur = 1;
                continue;
            }
            max = Math.max(cur, max);
        }
        return max;
    }
    private int getshunzi(String s) {
        char[] array = s.toCharArray();
        int curASC = 1;
        int curDEC = 1;
        int maxASC = 0;
        int maxDEC = 0;
        for (int i = 3; i < array.length - 1; i++) {
            int j = (int)array[i + 1];
            if (j - (int)array[i] == 1) {
                curASC++;
            } else {
                curASC = 1;
                continue;
            }
            maxASC = Math.max(curASC, maxASC);
        }
        for (int i = 3; i < array.length - 1; i++) {
            int j = (int)array[i + 1];
            if (j - (int)array[i] == -1) {
                curDEC++;
            } else {
                curDEC = 1;
                continue;
            }
            maxDEC = Math.max(curDEC, maxDEC);
        }
        return Math.max(maxASC, maxDEC);
    }

    public static void main(String[] args) {
        String s = "11111111111,22222222222";
        List<String> list = Arrays.asList(s.split(","));
//        for (String i : list) {
//            System.out.println(i.toString());
//        }
        Main m = new Main();
        String res = m.findBeauty("13101239876,13874978888,13974883410,13667345678");
        System.out.println(res.toString());
    }
}
