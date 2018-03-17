public class SubtractionClass implements Strategy {

    @Override
    public int executeOperation(int num1, int num2) {
        return (num2-num1);
    }
}
