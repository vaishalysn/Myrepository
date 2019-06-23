package pack1;
class StudentName
{
private String name="Rahul";
String getName()
{	
return name;
}
/*void setName(String name)// setName is mutable and getName is Immutable
{
	this.name=name;
}*/
}

class Encapsulation {

	public static void main(String[] args) 
	{
StudentName s=new StudentName();
//s.setName("Vaishaly");
System.out.println(s.getName());
	}

}
