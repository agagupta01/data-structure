package com.lambda.expressions;

public class Demo1 {

	public void greet() {
		System.out.println("Hello world!!");
	}
	
	public static void main(String[] args) {
		Thread myThread = new Thread( () -> {
		System.out.println("hello world!");
		System.out.println("Printed inside the runnable");
		});
		myThread.run();
		
	}

}
