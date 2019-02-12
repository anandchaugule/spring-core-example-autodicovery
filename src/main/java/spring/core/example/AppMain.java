package spring.core.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Application Context - Eagar Initialization
	    AbstractApplicationContext context = new ClassPathXmlApplicationContext("di-application.xml");
	    
	    Communication bean = (Communication) context.getBean("communication");
		bean.communicate();
		
//		Messaging m = new ActiveMQImpl();
//		Communication c = new Communication();
		
		context.close(); 
	}

}
