package singleton;

/**
 * @author by Jacky
 * @模块名称 Singleton
 * @desc 枚举式单例模式（究极版本）
 * 优点：a.不会一开始就对类进行初始化 b.JVM类加载机制保证了线程安全
 * 缺点：看不懂，本来是一个类，却用枚举来进行修饰，语义不高
 * @date Create on 2022-05-18 9:14
 */
public enum SingletonEnum {

    INSTANCE;

    public void m(){
        System.out.println("m");
    }

}
