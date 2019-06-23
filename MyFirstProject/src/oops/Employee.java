package oops;

public class Employee {
int id;
String name;
Address address;
Employee(int id, String name,Address address)
{
this.id=id;
this.name=name;
this.address=address;
}
void display()
{
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);
}
	public static void main(String[] args) {
    Address address1=new Address("Bangalore","Maharashtra","India");
    Address address2=new Address("Bangalore","Karnataka","India");
    Employee e1=new Employee(111,"XYZ",address1);
    Employee e2=new Employee(112,"Rahul",address2);
	e1.display();
	e2.display();
	}

}
