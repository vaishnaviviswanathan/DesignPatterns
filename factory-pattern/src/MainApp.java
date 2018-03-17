public class MainApp {
    public static void main(String args[]){
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.objectCreation("circle");
        shape1.draw();
        Shape shape2 = factory.objectCreation("rectangle");
        shape2.draw();
    }
}
