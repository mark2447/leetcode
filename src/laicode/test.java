package laicode;

public class test {
    public String toString(char[] array) {
        return new String(array, 0, 2);
    }
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd'};
        test t = new test();
        String list = t.toString(array);
        System.out.println(list);
    }
}
