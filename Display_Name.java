package mypack;

import java.util.Scanner;

class MyClass
{
	
	void Display()
	{
		System.out.println("My name is Suvarna");
	}
	
	void Display_Again(String name)
	{
		System.out.println("My name is "+name);
	}
		
}

class Display_Name
{
	public static void main(String args[])
	{
		
		MyClass c = new MyClass();
		c.Display();
		c.Display_Again("Ragini");
		
		
		
	}
}
