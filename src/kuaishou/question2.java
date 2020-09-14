package kuaishou;


import java.util.Scanner;

public class question2 {
    public String findGreater(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }
//        1 22 22 33 22 12 45 44 5
//        4, 7
        String[] a = input.split(" ");
        StringBuilder sb = new StringBuilder();
        int[] b = new int[a.length];
        for (int i = 1; i < a.length; i++) {
            int count = 0;
            for (int j = i; j >= 0; j--) {
                if (Integer.parseInt(a[j]) > Integer.parseInt(a[i])) {
                    count++;
                }
            }
            if (count == 1) {
                sb.append(i);
                sb.append(" ");
            }
        }
        return sb.length() == 0 ? "-1" : sb.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        question2 q2 = new question2();
        System.out.println(q2.findGreater(i));
    }
}
