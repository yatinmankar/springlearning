package comtwo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Messaging;

@Component
@Qualifier
public class EmailService implements Messaging{

	public EmailService()  {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor EmailService ");
	}

	public void sendMessage() {
		System.out.println("Send message through email service");
		
	}

}
