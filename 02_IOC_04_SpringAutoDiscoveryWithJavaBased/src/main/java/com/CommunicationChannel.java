package com;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@Component
public class CommunicationChannel {
	
	//@Autowired   // By default settter level provided by Autowired hence no
	//@Autowired //setter injection
    //@Qualifier("abc") 
	private Messaging msgService;

	public CommunicationChannel() {
		System.out.println("Constructor Communication default  ");

	}

	//@Autowired  //constructor injection

	public CommunicationChannel(Messaging msgService) {
		System.out.println("Constructor Communication parameter ");
		this.msgService=msgService;
		// TODO Auto-generated constructor stub
	}

	@Autowired //setter injection
	@Qualifier()
 	public void setMsgService(Messaging msgService) {
		System.out.println("Communication setter method msgService ");
		this.msgService = msgService;
	}

  public void communicate(){
	  msgService.sendMessage();
  }
	
	
}
