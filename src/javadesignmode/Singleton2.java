package javadesignmode;

/**
 * 饿汉式（静态代码块）
 */
public class Singleton2 {
    private final static Singleton2 INCETANCE;

    static{
        INCETANCE = new Singleton2();
    }

    private Singleton2(){}

    public static Singleton2 getIncetance(){
        return INCETANCE;
    }
}
