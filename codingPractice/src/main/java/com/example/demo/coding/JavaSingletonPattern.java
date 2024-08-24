package com.example.demo.coding;


/*Complete the Singleton class in your editor which contains the following components:

A private Singleton non parameterized constructor.
A public String instance variable named str.
Write a static method named getSingleInstance that returns the single instance of the Singleton class.*/

public class JavaSingletonPattern {
	
	
	private JavaSingletonPattern()
    {
        
    }
	
	String str;
	
	public static JavaSingletonPattern getSingleInstance()
    {
		JavaSingletonPattern singleton = new JavaSingletonPattern();
        return singleton;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
