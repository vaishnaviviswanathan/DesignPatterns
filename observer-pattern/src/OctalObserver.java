public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void observerExection() {
        System.out.println("OctalObserver = "+ Integer.toOctalString(subject.getState()));
    }
}
