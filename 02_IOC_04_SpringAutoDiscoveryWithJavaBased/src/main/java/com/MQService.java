package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component   //AutoDiscovery

public class MQService implements Messaging {

	public MQService() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor MQService ");
	}

	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Send message through MQ service");
	}

}
