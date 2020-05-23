package com.examples.behavioralPattern.observer;

public class MessageSubscriberOne implements Observer {

	@Override
	public void receiptOfMessage(String message) {
		
		System.out.println("Received by Subcriber One :"+message);
	}

}
