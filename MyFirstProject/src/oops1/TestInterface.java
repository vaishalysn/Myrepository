package oops1;


	interface Printer
	{
		void print();
	}
class Sonyprinter implements Printer// in case of interface implements keyword is used
{
public void print()
{
System.out.println("Sony printer is printing");	
}
}
class HPprinter implements Printer
{
public void print()
{
System.out.println("HP printer is printing");	
}
}

public class TestInterface {
	public static void main(String[] args) {
	Printer d=new HPprinter();
    d.print();
	}
	}

