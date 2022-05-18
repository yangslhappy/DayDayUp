public class SingletonInnerClass {

    private SingletonInnerClass() {
    }

    private static class SingletonInnerClassHolder{
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance(){
        return SingletonInnerClassHolder.INSTANCE;
    }

}
