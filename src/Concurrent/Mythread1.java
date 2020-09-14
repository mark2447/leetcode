package Concurrent;

public class Mythread1 implements Runnable{
    private int i;
    public Mythread1(int i) {
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println("welcome thread" + i);
    }
}
