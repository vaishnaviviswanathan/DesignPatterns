public class RedShapeDecorator extends DecoratorDrawAPIAbstract {

    public RedShapeDecorator(DrawAPI drawAPI) {
        super(drawAPI);
    }

    @Override
    public void draw() {
        super.draw();
        drawShapeWithRedBorder(drawAPI);
    }

    public void drawShapeWithRedBorder(DrawAPI drawAPI){
        System.out.println("shape with red border drawn");
    }
}
