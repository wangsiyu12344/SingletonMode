package javadesignmode;

/**
 * 静态内部类: 在加载外部类时，并不会初始化内部类中的成员变量。
 */
public class Singleton6 {

    private Singleton6(){}

    //静态内部类
    private static class SingletonInstance {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public Singleton6 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
