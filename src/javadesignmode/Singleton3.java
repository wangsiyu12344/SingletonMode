package javadesignmode;

/**
 * 懒汉式：不使用时就不加载已节省内存（线程不安全，不可用)
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3(){}


    //该方法是线程不安全的，考虑线程竞争的情况，可能会有多个线程同时进入if语句中创建多个实例。
    public Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
