public class MessageSubscriberThree implements Observer
{
@Override
//method to update subscriber 3, used by subject
public void update(Message m) {
System.out.println("Bob :: " + m.getMessageContent());
}
}  
