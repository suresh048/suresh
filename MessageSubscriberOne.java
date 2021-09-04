public class MessageSubscriberOne implements Observer
{
@Override
//method to update subscriber 1, used by subject
public void update(Message m) {
System.out.println("Paul :: " + m.getMessageContent());
}
} 
