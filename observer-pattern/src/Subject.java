import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observerList = new ArrayList<>();
    int state;

    public void setState(int state){
        this.state=state;
        notifyAllObservers();
    }

    public int getState(){
        return state;
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer:observerList){
            observer.observerExection();
        }
    }

}
