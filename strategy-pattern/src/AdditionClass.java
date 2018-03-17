public class AdditionClass implements Strategy{
    @Override
    public int executeOperation(int num1, int num2) {
        return (num1+num2);
    }
}
