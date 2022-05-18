public class SingletonHunger {

    private final static SingletonHunger INSTANCE = new SingletonHunger();

    private SingletonHunger() {

    }

    public static SingletonHunger getInstance(){
        return INSTANCE;
    }

}
