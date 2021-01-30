package com;

public class Communication {

	private Messaging msgService;

	public Communication() {
		System.out.println("Communication default constructor ");

	}

	
	public Communication(Messaging msgService) {
		System.out.println("Communication param constructor ");
		this.msgService=msgService;
		// TODO Auto-generated constructor stub
	}


	public void setMsgService(Messaging msgService) {
		System.out.println("Communication setter method msgService ");
		this.msgService = msgService;
	}

  public void communicate(){
	  msgService.sendMessage();
  }
	
	
}
