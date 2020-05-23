package com.examples.creationalPattern;

public class Singleton {

	private static Singleton instance = null;
	public String str;
	private Singleton(String str){
		this.str=str;
	}
	
	public static Singleton getInstance(String str){
		if(instance==null){
			instance = new Singleton(str);
		}
		return instance;
	}
	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance("Test 1");
		System.out.println("Value : "+obj1.str);
		
		
		
		

	}

}
