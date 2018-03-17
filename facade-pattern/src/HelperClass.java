public class HelperClass {

    private ShapeClass rectangle;
    private ShapeClass square;

    public HelperClass(){
        rectangle = new CreateRectangle();
        square = new CreateSquare();
    }

    public void executeSquare(){
        square.executeOperations();
    }

    public void executeRectangle(){
        rectangle.executeOperations();
    }
}
