package oops;
class Father//parent class, super class, base class
{
	void sleep()//method
	{
		System.out.println("I sleep");
	}
	void angry()
	{
		System.out.println("I get angry");
	}
	void hunger()
	{
		System.out.println("I am hungry");
	}
}
class Son extends Father//child class, sub class, extended class, derived class
{
     void smile()//method
     {
    	 System.out.println("I smile");
     }
     void love()
     {
    	 System.out.println("Loves me");
     }
}
class Grandson extends Son
{
void cry()//method
{
System.out.println("I am crying");	
}
}
class Testinheritance {//driving class


	public static void main(String[] args) {

/*Son s=new Son();//child class reference and child class object
s.angry();
s.sleep();
s.hunger();
s.love();
s.smile();*/
		/*Father f=new Father();//base class reference and base class object
		f.angry();
		f.sleep();
		f.hunger();*/
		/*Father f=new Son();//base class reference and child class object
		f.sleep();
		f.hunger();
		f.angry();*/
		/*Son s=new Father();//child class reference and base class object
		s.sleep();
		s.angry();
		s.hunger();
		s.love();
		s.angry();*///Invalid object
		/*Grandson g=new Grandson();
		g.angry();
		g.cry();
		g.smile();
		g.sleep();
		g.hunger();
		g.love();*///Multilevel Inheritance
		
	}

}
