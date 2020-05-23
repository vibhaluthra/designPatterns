package com.examples.behavioralPattern.memento;

public class Main {

	public static void main(String[] args) {
		
		//original Content
		Article article = new Article("1", "abc", "xyz");
		System.out.println(article.toString());
		
		//create an immutable object
		ArticleMemento articleMemento = article.createMemento();
		
		//changed content
		article.setContent("mno");
		System.out.println(article.toString());
		
		//restore article
		article.restoreMemento(articleMemento);		
		System.out.println(article.toString());
		
		

	}

}
