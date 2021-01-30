package com;

import org.springframework.stereotype.Component;

//@Component
public class EmailService implements Messaging{

	public EmailService()  {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor EmailService ");
	}

	public void sendMessage() {
		System.out.println("Send message through email service");
		
	}

}
