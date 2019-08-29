package com.mobiliya.demo.model;

public class Message {
	
	String messageid;
	String messageDesc;
	public String getMessageid() {
		return messageid;
	}
	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}
	public String getMessageDesc() {
		return messageDesc;
	}
	public void setMessageDesc(String messageDesc) {
		this.messageDesc = messageDesc;
	}
	public Message(String messageid, String messageDesc) {
		super();
		this.messageid = messageid;
		this.messageDesc = messageDesc;
	}
	
	

}
