package se8;

public final class SingletonObj {

    private SingletonObj() {
    }

    private static SingletonObj instance = null;

    public static SingletonObj getInstance() {
        if (instance == null) {
            synchronized(SingletonObj.class) {
                if (instance == null) {
                    instance = new SingletonObj();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonObj a = SingletonObj.getInstance();
        SingletonObj b = SingletonObj.getInstance();
        SingletonObj c = SingletonObj.getInstance();

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}
