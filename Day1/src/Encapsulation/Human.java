package Encapsulation;

public class Human {
	private int age; // this variable is accessible only in same class
	private String name; 
	
	//age is an instant variable
	// local variable is a .
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*public int getAge() //method is used to access the private variables
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
	*/
	

}
