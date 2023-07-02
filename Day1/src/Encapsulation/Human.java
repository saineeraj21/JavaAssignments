package Encapsulation;

public class Human {
	private int age; // this variable is accessible only in same class
	private String name;
	
	public int getAge() //method is used to access the private variables
	{
		return age;
	}
	public void setAge(int a)
	{
		age = a ;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String b)
	{
		name = b ;
	}

}
