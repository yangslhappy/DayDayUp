package singleton;

/**
 * @author by Jacky
 * @模块名称 Singleton
 * @desc 懒汉式单例模式
 * 优点：只有调用getInstance()时，才会对类进行初始化
 * 缺点：线程不安全，当遇到并发时，会产生多个不同的示例
 * @date Create on 2022-05-18 9:14
 */
public class SingletonLazy {

    public static SingletonLazy INSTANCE = null;

    private SingletonLazy(){};

    public void m(){
        System.out.println("m");
    }

    public static SingletonLazy getInstance(){
        if(INSTANCE ==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }

}