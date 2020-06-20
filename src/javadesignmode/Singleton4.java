package javadesignmode;

/**
 * 线程安全的懒汉式单例模式写法：同步方法，方法上加上synchronized关键字。但不推荐使用, 因为效率太低。
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4(){}

    public synchronized static Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
