package Classobjconst;

public class Employee {
	int id;
	String name;
	Employee()//Constructor
	{
		System.out.println("I am a default constructor");
	}
	void m()//METHOD
	{
		System.out.println("I am method");
	}

	public static void main(String[] args) {
		Employee a=new Employee();//Object which calls the constructor immediately on object creation
        a.m();
	}

}
