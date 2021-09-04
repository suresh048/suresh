public class MessageSubscriberTwo implements Observer
{
@Override
//method to update subscriber 2, used by subject
public void update(Message m) {
System.out.println("Job:: " + m.getMessageContent());
}
}  
