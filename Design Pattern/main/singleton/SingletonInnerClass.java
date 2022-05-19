package singleton;

/**
 * @author by Jacky
 * @模块名称 Singleton
 * @desc 内部类单例模式（性能最优）
 * 优点：a.懒汉式加载（内部类比外部类先加载）b.JVM类加载机制保证了线程安全
 * 缺点：除了不熟悉这样的写法，找不出其他缺点
 * @date Create on 2022-05-18 9:14
 */
public class SingletonInnerClass {

    private SingletonInnerClass(){}

    private static class SingletonInnerClassHolder{

        static {
            System.out.println("加载了");
        }
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance(){
        return SingletonInnerClassHolder.INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

}

