package Message;
 interface Notification 
 {
    void notifyUser();
}
class SMSNotification implements Notification
{
 public void notifyUser() 
 {
     System.out.println("Sending an SMS Notification");
 }
}
 class EmailNotification implements Notification 
 {
 public void notifyUser() 
 {
     System.out.println("Sending an Email Notification");
 }
}
class PushNotification implements Notification
{
 public void notifyUser() 
 {
     System.out.println("Sending a Push Notification");
 }
}

public class NotificationFactory 
{
	 public Notification createNotification(String type)
	 {
	        if (type == null || type.isEmpty())
	            return null;
	        if ("SMS".equalsIgnoreCase(type))
	            return new SMSNotification();
	        else if ("EMAIL".equalsIgnoreCase(type))
	            return new EmailNotification();
	        else if ("PUSH".equalsIgnoreCase(type))
	            return new PushNotification();
	        return null;
	    }
}
