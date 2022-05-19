package singleton;

/**
 * @author by Jacky
 * @模块名称 Singleton
 * @desc 懒汉式单例模式（线程安全版）
 * 优点：a.只有调用getInstance()时，才会对类进行初始化 b.保证了线程安全
 * 缺点：a.复杂了，通过加锁并且对示例进行双重非空验证 b.效率降低，加锁是非常消耗资源的
 * @date Create on 2022-05-18 9:14
 */
public class SingletonLazyDoubleCheckLock {

    public static volatile SingletonLazyDoubleCheckLock INSTANCE = null;

    private SingletonLazyDoubleCheckLock(){};

    public void m(){
        System.out.println("m");
    }

    public static SingletonLazyDoubleCheckLock getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonLazyDoubleCheckLock.class){
                if(INSTANCE == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    INSTANCE = new SingletonLazyDoubleCheckLock();
                }
            }
        }
        return INSTANCE;
    }

}