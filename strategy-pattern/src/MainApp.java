public class MainApp {
    public static void main(String args[]) {
        Context context1 = new Context(new AdditionClass());
        Context context2 = new Context(new SubtractionClass());
        System.out.println("Addition:"+context1.executeOperaton(10, 5));
        System.out.println("Subtraction:"+context2.executeOperaton(5, 10));
    }
}
