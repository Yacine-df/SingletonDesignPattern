package designPatterns;

import singleton.Singleton;

public class Main {

	public static void main(String[] args) {
		
		Singleton FirstObj = Singleton.getInstance("FOO");
		
		System.out.println(FirstObj.getValue());
		
		//We can't create another object bcz w've used Singleton design pattern 
		// It will return the value of the first created object
		
		Singleton SecondObj = Singleton.getInstance("BAR");
		
		System.out.println(SecondObj.getValue());;

	}

}
