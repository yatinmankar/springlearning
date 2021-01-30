import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.CommunicationChannel;

import config.CommunicationConfig;

@Configuration
@ComponentScan({"com","comtwo"})

public class AppMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppMain.class);
	    CommunicationChannel beanMq = (CommunicationChannel) context.getBean("communicationChannel");
	    beanMq.communicate();
 	    context.close();

		
		
	}

}
