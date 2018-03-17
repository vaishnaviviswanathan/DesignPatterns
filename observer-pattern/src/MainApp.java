public class MainApp {

    public static void main(String args[]){
        Subject subject = new Subject();

        HexaObserver hexa = new HexaObserver(subject);
        OctalObserver octal = new OctalObserver(subject);
        BinaryObserver binary = new BinaryObserver(subject);

        subject.setState(15);
        subject.setState(18);
    }

}
