package spring.core.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Communication {
	
	@Autowired
	private Messaging messaging;
	
	public Communication() {
		System.out.println("In Communication Default Constructor ....");
	}

	//@Autowired /** This will constructor injection **/
	public Communication(Messaging messaging) {
		super();
		this.messaging = messaging;
		System.out.println("In Parameter Communication Constructor ....");
	}

	public Messaging getMessaging() {
		return messaging;
	}

	//@Autowired /** This will setter injection byType **/
	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
		System.out.println("In Setter setMessaging...");
	}
	
	public void communicate() {
		messaging.sendMessage();
	}

}
