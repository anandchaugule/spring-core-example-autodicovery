package spring.core.example;

import org.springframework.stereotype.Component;

@Component
public class ActiveMQImpl implements Messaging {
	
	public ActiveMQImpl() {
		System.out.println("In ActiveMQImpl Constructor ...");
	}

	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Sending message by ActiveMQ ......");
	}
}
