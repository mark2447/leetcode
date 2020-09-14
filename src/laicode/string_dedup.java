package laicode;

import java.util.ArrayDeque;
import java.util.Deque;

public class string_dedup {
    public String deDup(String input) {
        // Write your solution here
        if (input == null || input.length()<=1) {
            return input;
        }
        char[] array = input.toCharArray();
        Deque<Character> queue = new ArrayDeque<>();

        for (int i = 0; i < array.length; i++) {
            if (queue.isEmpty() || queue.peekLast() != array[i]) {
                queue.offerLast(array[i]);
            } else {
                while (i + 1 < array.length && queue.peekLast() == array[i]) {
                    i++;
                }
                System.out.println(queue.peekLast());
                queue.pollLast();
                System.out.println(queue.isEmpty());
            }
        }
        int end = 0;
        char[] res = new char[queue.size() - 1];
        while (!queue.isEmpty()) {
            res[end++] = queue.pollFirst();
        }
        return new String(array, 0 , array.length);
    }

    public static void main(String[] args) {
        String input = "aababab";
        string_dedup res = new string_dedup();
        String r = res.deDup(input);
        System.out.println(r);
    }
}
