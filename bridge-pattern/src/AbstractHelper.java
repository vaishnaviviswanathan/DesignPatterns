public abstract class AbstractHelper {

    protected Shape shape;

    public AbstractHelper(Shape shape){
        this.shape=shape;
    }

    public abstract void draw();

}
