package laicode;

import java.util.HashSet;
import java.util.Set;
//不标准，以laicode上的答案为准
public class laicode382 {
    public String shortest(String input, int k) {
        // Write your solution here
        if (k <= 0) {
            return new String();
        }
        if (input == null) {
            return null;
        }
        Set<Character> window = new HashSet<>();
        int start = 0;
        int end = 0;
        int size = input.length();
        int[] freq = new int[26];
        for (int low = 0, high = 0; high < input.length(); high ++) {
            window.add(input.charAt(high));
            freq[input.charAt(high) - 'a']++;

            while (window.size() >= k && high != input.length() - 1) {
                if (--freq[input.charAt(low) - 'a'] == 0) {
                    window.remove(input.charAt(low));
                }
                low ++;
            }

            if (high - low < size && window.size() == k) {
                size = high - low;
                start = low;
                end = high;
            }
        }
        while (freq[input.charAt(start) - 'a'] != 1 && start < end) {
            freq[input.charAt(start) - 'a']--;
            start++;
        }
        return input.substring(start, end + 1);
    }

    public static void main(String[] args) {
        laicode382 solution = new laicode382();
        String res = solution.shortest("abbbbbcccaab", 3);
        System.out.println(res);
    }
}
