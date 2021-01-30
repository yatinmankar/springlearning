package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Communication {
	
	//@Autowired   // By default settter level provided by Autowired hence no
	//@Autowired //setter injection
    //@Qualifier("abc") 
	private Messaging msgService;

	public Communication() {
		System.out.println("Constructor Communication default  ");

	}

	//@Autowired  //constructor injection

	public Communication(Messaging msgService) {
		System.out.println("Constructor Communication parameter ");
		this.msgService=msgService;
		// TODO Auto-generated constructor stub
	}

	@Autowired //setter injection
    @Qualifier("abc") 
	public void setMsgService(Messaging msgService) {
		System.out.println("Communication setter method msgService ");
		this.msgService = msgService;
	}

  public void communicate(){
	  msgService.sendMessage();
  }
	
	
}
