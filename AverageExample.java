package mypack;

import java.util.Scanner;

class MyClass
{
	
	int avg;
	
	void average(int a,int b,int c,int d,int e)
	{
		avg = (a+b+c+d+e)/5;
		System.out.println("Average of "+a+","+","+b+","+c+","+d+","+e+" is =  "+avg);
	}
	
	
}

public class AverageExample
{
	public static void main(String args[])
	{
		MyClass c = new MyClass();
		
		c.average(10, 20,30,40,50);
		c.average(101, 303,105,450,270);
		
		
		
	}
}
