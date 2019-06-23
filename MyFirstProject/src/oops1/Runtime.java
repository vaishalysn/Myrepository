package oops1;
class Animal
{
void eat()
{
	
System.out.println("Animal is eating");}
}
class Dog extends Animal
{
void eat()	
{
System.out.println("DOg is eating");	
}
}

	
public class Runtime {
public static void main(String[] args) {
	Animal a=new Dog();
	a.eat();


	}

}
