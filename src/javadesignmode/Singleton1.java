package javadesignmode;

/**
 * 饿汉式单例模式（静态常量）
 * 优点：因为INSTANCE在类加载的时候就被创建了，所以不存在多线程安全问题。叫饿汉式的原因:急不可耐，在类加载入JVM时就创建好了INCETANCE对象。
 */
public class Singleton1 {
    private final static Singleton1 INSTANCE = new Singleton1();

    //构造函数私有
    private Singleton1(){

    }
    //外接接口
    public static Singleton1 getInstance(){
        return INSTANCE;
    }
}
