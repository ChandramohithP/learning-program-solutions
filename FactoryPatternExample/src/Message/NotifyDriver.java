package Message;

public class NotifyDriver {

	public static void main(String[] args) {
		
	        NotificationFactory factory = new NotificationFactory();

	        Notification sms = factory.createNotification("SMS");
	        sms.notifyUser();

	        Notification email = factory.createNotification("EMAIL");
	        email.notifyUser();

	        Notification push = factory.createNotification("PUSH");
	        push.notifyUser();
	    
	}

}
