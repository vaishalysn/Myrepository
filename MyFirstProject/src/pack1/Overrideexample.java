package pack1;

class A
{
void read()
{
System.out.println("Hello Java");	
}
}


class B extends A
{
public void read()
{
System.out.println("Hello override Java");
}
}
class Overrideexample
{
	public static void main(String[] args)
	{
		B obj=new B();
		obj.read();
		A c=new A();
		c.read();
		
	}
}