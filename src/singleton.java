public class singleton {
    private volatile static singleton uniqueInstance;
    private singleton(){

    }
    public static singleton getUnique(){
        if (uniqueInstance == null) {
            synchronized (singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
