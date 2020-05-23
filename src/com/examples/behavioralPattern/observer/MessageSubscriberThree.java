package com.examples.behavioralPattern.observer;

public class MessageSubscriberThree implements Observer {

	@Override
	public void receiptOfMessage(String message) {
		
		System.out.println("Received by Subcriber Three :"+message);
	}

}
