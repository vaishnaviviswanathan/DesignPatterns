public class ShapeFactory {

    Shape shape;

    public Shape objectCreation(String shapeType){
        if(shapeType.equalsIgnoreCase("null")){
            shape = null;
        }
        else if (shapeType.equalsIgnoreCase("circle")){
            shape = new Circle();
        }
        else if(shapeType.equalsIgnoreCase("rectangle")){
            shape =  new Rectangle();
        }
        return shape;
    }

}
