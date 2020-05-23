package com.examples.behavioralPattern.observer;

public class MessageSubscriberTwo implements Observer {

	@Override
	public void receiptOfMessage(String message) {
		
		System.out.println("Received by Subcriber Two :"+message);
	}

}
