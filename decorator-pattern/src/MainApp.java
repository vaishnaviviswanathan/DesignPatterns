import javafx.scene.shape.Circle;

public class MainApp {
    public static void main(String args[]){

        //Normal border circle
        CircleDrawAPI circle = new CircleDrawAPI();
        circle.draw();

        //Red color border circle
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(new CircleDrawAPI());
        redShapeDecorator.draw();
    }
}
