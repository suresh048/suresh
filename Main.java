public class Main
{
public static void main(String[] args)
{
MessageSubscriberOne s1 = new MessageSubscriberOne();
MessageSubscriberTwo s2 = new MessageSubscriberTwo();
MessageSubscriberThree s3 = new MessageSubscriberThree();
//synchronization is used to make sure any observer registered after message is
//received is not notified

MessagePublisher p = new MessagePublisher();

p.attach(s1);
p.attach(s2);
//s1 and s2 will receive the update
p.notifyUpdate(new Message("1st update"));

p.detach(s1);// s1 is removed and only s2 and s3 remain
p.attach(s3);
//s2 and s3 will receive the update
p.notifyUpdate(new Message("2nd update"));
}
}  
