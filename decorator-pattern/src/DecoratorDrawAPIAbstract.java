public abstract class DecoratorDrawAPIAbstract implements DrawAPI {

    DrawAPI drawAPI;

    public DecoratorDrawAPIAbstract(DrawAPI drawAPI){
        this.drawAPI=drawAPI;
    }

    public void draw(){
        drawAPI.draw();
    }

}
