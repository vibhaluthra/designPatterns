package com.examples.creationalPattern.singleton;

public class Singleton {

	private static volatile Singleton instance = null;
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
		
		// instantiating Singleton class with variable obj1, obj2, obj3
		Singleton obj1 = Singleton.getInstance("Singleton Test 1");
		Singleton obj2 = Singleton.getInstance("Singleton Test 2");
		Singleton obj3 = Singleton.getInstance("Singleton Test 3");
		
		System.out.println("Value : "+obj1.str);
		System.out.println("Value : "+obj2.str);
		System.out.println("Value : "+obj3.str);
		
		// changing variable of instance obj1
		obj1.str= (obj1.str).toUpperCase();
		
		System.out.println("Value : "+obj1.str);
		System.out.println("Value : "+obj2.str);
		System.out.println("Value : "+obj3.str);
		
		
		

	}

}
