package com.examples.behavioralPattern.observer;

public interface MessagePublisher {

	public void attach(Observer o);
	public void dettach(Observer o);
	public void notifyObservers(String str);
}
