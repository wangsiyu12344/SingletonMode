package javadesignmode;

/**
 * 枚举单例写法:
 */
public enum Singleton7 {
    INSTANCE;

    //随意写一些方法。别的类可以通过 Singleton7.enum.方法名()来调用这个方法
    public void whatever(){}

}
