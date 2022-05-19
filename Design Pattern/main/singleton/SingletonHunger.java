package singleton;

/**
 * @author by Jacky
 * @模块名称 Singleton
 * @desc 饿汉式单例模式
 * 优点：简单、易理解且线程安全
 * 缺点：不管用不用，当类加载时就会初始化实例
 * @date Create on 2022-05-18 9:10
 */
public class SingletonHunger {

    public static SingletonHunger INSTANCE = new SingletonHunger();

    private SingletonHunger() {}

    public void m(){
        System.out.println();
    }

    public static SingletonHunger getInstance(){
        return INSTANCE;
    }

}
