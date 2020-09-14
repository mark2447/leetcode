package alibaba;

import kuaishou.Main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class question1 {
    public int minTime(String S, String T) {
        if (S == null && T == null || S.length() == 0 && T.length() == 0) {
            return 0;
        }
        if (S == null || T == null) {
            return -1;
        }
        if (S.length() != T.length()) {
            return -1;
        }
//        HashMap<Character, Integer> mapS = new HashMap<>();
//        for (int i = 0; i < S.length(); i++) {
//            if (!mapS.containsKey(S.charAt(i))) {
//                mapS.put(S.charAt(i), 0);
//            } else {
//                mapS.put(S.charAt(i), mapS.get(S.charAt(i)) + 1);
//            }
//        }
//        HashMap<Character, Integer> mapT = new HashMap<>();
//        for (int i = 0; i < T.length(); i++) {
//            if (!mapT.containsKey(T.charAt(i))) {
//                mapT.put(T.charAt(i), 0);
//            } else {
//                mapT.put(T.charAt(i), mapT.get(T.charAt(i)) + 1);
//            }
//        }
//        for (Map.Entry<Character, Integer> e : mapS) {
//
//        }
        //S: a c d k
        //S1:c d k a
        //S2:c k a d
        int count = 0;
        int indexS = 0;
        int indexT = 0;
        StringBuilder sb = new StringBuilder();
        while (indexS < S.length() && indexT < T.length()) {
            if (S.charAt(indexS) == T.charAt(indexT)) {
                indexS++;
                indexT++;
            } else {
                sb.append(S.charAt(indexS));
                indexS++;
                count++;
            }
        }
        count += minTime(sb.toString(), T.substring(indexT));
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        question1 q = new question1();
        int count = q.minTime(S, T);
        System.out.println(count);
    }
}
