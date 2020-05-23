package com.examples.behavioralPattern.observer;

public class Main {

	public static void main(String[] args) {
		
		MessagePublisherImpl publisher = new MessagePublisherImpl();
		
		MessageSubscriberOne subscriberOne = new MessageSubscriberOne();
		MessageSubscriberTwo subscriberTwo = new MessageSubscriberTwo();
		MessageSubscriberThree subscriberThree = new MessageSubscriberThree();
		
		publisher.attach(subscriberOne);
		publisher.attach(subscriberTwo);
		publisher.attach(subscriberThree);
		
		publisher.notifyObservers("Hii All, This is the observer pattern");
		
		publisher.dettach(subscriberTwo);
		
		publisher.notifyObservers("Subscriber Two is dettached");
		
	}

}
