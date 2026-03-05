package mypack;

import java.util.Scanner;

class MyClass
{
	
	boolean ans;
	boolean can_drive_a_vehicle(boolean is_age_above_18)
	{
		if(is_age_above_18==true)
		{
			System.out.println("You can drive a vehicle");
			ans = true;
		}
		else if (is_age_above_18==false)
		{
			System.out.println("Sorry.You can't drive a vehicle");
			ans = false;
		}
	return ans;
	}
	
		
}

class Drive_vehicle_or_not
{
	public static void main(String args[])
	{
		
		boolean my_ans;
		
		MyClass c = new MyClass();
		
		my_ans = c.can_drive_a_vehicle(true);
		
		System.out.println("You can drive a vehicle?"+my_ans);
				
		
		
		
	}
}
