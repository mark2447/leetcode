package laicode;

public class laicode_string1 {
    public String deDup(String input) {
        // Write your solution here
        if (input == null) {
            return null;
        }
        char[] array = input.toCharArray();
        int end = 0;
        for (int i = 1; i < array.length; i++) {
            System.out.println(array);
            System.out.println(i);
            System.out.println(end);
            if (array[i] != array[end]||(array[i] == array[end] && array[end] != array[end - 1])) {
                array[++end] = array[i];
            }
        }
        return new String(array, 0 , end);
    }


    public static void main(String[] args) {
        String input = "";
        laicode_string1 res = new laicode_string1();
        String r = res.deDup(input);
        System.out.println(r);
    }
}
