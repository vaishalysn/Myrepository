package oops1;
abstract class vehicle//abstract class does not give 100% abstraction. For that Interface keyword is used
{
abstract void drive();
}
class Maruti extends vehicle
{
void drive()
{
System.out.println("I am driving Maruti Suzuki");	
}
}
class Toyota extends vehicle
{
void drive()
{
System.out.println("I am driving Toyota");
}
}
class TestAbstraction
{
public static void main(String[] args)
	{
		vehicle s=new Toyota();
			s.drive();

	}
}
