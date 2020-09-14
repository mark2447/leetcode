package newcode;

import java.util.Scanner;

public class newcodetest {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int L = Integer.parseInt(line.split(" ")[1]);
        System.out.println(getNumbers(N, L));
        return;
    }
    public static String getNumbers(int N, int L) {
        StringBuilder sb = new StringBuilder();
        for (int i = L; i <= 100; i++) {
            if (2*N%i == 0) {
                int twoStart = (2*N)/i - i - 1;
                if (twoStart % 2 == 0) {
                    int start = twoStart/2;
                    for (int j = 1; j <= i; j++) {
                        sb.append(start+j);
                        if (j != i) {
                            sb.append(" ");
                        }
                    }
                    return sb.toString();
                }
            }
        }
        return "No";
    }
}
