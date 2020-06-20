package javadesignmode;

/**
 * 双重检查:推荐在面试的时候使用。 是线程安全的.
 * 为什么要用volatile关键字? 因为新建对象不是原子操作。 为了防止指令的重排序。
 * 新建一个对象其实有3个步骤 ： 1.分配内存空间； 2.执行构造方法来初始化字段的值； 3.把instance对象指向分配的内存空间。
 * 如果是执行顺序是1->3->2（发生了指令的重排序）， 那么最后得到的instance不是我们期望的值。
 */
public class Singleton5 {
    private volatile static Singleton5 instance;

    private Singleton5(){}

    public Singleton5 getInstance(){
        if(instance == null){
            synchronized (Singleton5.class){
                if(instance == null){
                    instance = new Singleton5();
                }

            }
        }
        return instance;
    }
}
