public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void observerExection() {
        System.out.println("BinaryObserver = "+ Integer.toBinaryString(subject.getState()));
    }
}
