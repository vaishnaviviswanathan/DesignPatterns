public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy=strategy;
    }

    public int executeOperaton(int num1,int num2){
        return strategy.executeOperation(num1,num2);
    }
}
