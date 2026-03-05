package mypack;

class Employee
{
	int employee_id;
	char gender;
	String name;
	long payment;
	String address;
	float ratings;
	
	Employee(int employee_id,char gender,String name,long payment,String address,float ratings)
	{
		this.employee_id = employee_id;
		this.gender = gender;
		this.name = name;
		this.payment = payment;
		this.address = address;
		this.ratings = ratings;
	}
	
	void Display_My_Data()
	{
		System.out.println(" Employee id is "+employee_id+".\n Name:"+name+".\n gender : "+gender
	+".\n Payment = "+payment+".\n Address : "+address+".\n Ratings : "+ratings+".");
	}
}


class EmployeeInfo
{
	public static void main(String args[])
	{
		Employee e = new Employee(1, 'f', "Suvarna", 40000, "India", 4.7f);
		e.Display_My_Data();
	}
}
