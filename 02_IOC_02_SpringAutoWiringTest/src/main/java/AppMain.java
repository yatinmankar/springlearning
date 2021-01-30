import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Communication;


public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("communication-config.xml");
		
		//System.out.println("-----------------Using constructor------------------------");
	    
	    Communication beanMq = (Communication) context.getBean("MQcommunicationChannel");
	    beanMq.communicate();
       // System.out.println("-----------------Using Setter------------------------");
 
	   //  Communication beanEmail = (Communication) context.getBean("EmailcommunicationChannel");
	    // beanEmail.communicate();
	     
	     
	     context.close();

		
		
	}

}
