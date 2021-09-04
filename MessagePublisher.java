X

MessagePublisher.java
import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

private List<Observer> observers = new ArrayList<>();

@Override
// method to attach observers
public void attach(Observer o) {
observers.add(o);
}

@Override
//method to detach observers
public void detach(Observer o) {
observers.remove(o);
}

@Override
//method to notify observers of change
public void notifyUpdate(Message m) {
for(Observer o: observers) {
o.update(m);
}
}
}  
