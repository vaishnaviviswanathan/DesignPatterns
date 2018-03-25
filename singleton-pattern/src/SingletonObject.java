public class SingletonObject {

    private static SingletonObject singletonObject= new SingletonObject();

    private SingletonObject(){
    }

    public static SingletonObject getInstance(){
        return singletonObject;
    }
    public void exampleMethod(){
        System.out.println("Inside of singleton class");
    }

}
