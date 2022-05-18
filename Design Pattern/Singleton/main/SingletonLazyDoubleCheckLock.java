public class SingletonLazyDoubleCheckLock {

    private static volatile SingletonLazyDoubleCheckLock INSTANCE = null;

    private SingletonLazyDoubleCheckLock() {

    }

    public static SingletonLazyDoubleCheckLock getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonLazyDoubleCheckLock.class){
                if(INSTANCE == null){
                    INSTANCE = new SingletonLazyDoubleCheckLock();
                }
            }
        }
        return INSTANCE;
    }

}
