package com.examples.behavioralPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisherImpl implements MessagePublisher {

	List<Observer> listOfObservers = new ArrayList<>();
	
	@Override
	public void attach(Observer o) {
		listOfObservers.add(o);
	}

	@Override
	public void dettach(Observer o) {
		
		listOfObservers.remove(o);
	}

	@Override
	public void notifyObservers(String str) {
		System.out.println("===== Message Sending =====");
		for(Observer observer :listOfObservers)
		{
			observer.receiptOfMessage(str);
		}
	}

}
