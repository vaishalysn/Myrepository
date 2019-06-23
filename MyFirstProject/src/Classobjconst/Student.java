package Classobjconst;

public class Student {
int id;
String Name;
Student(int id, String Name)//LOCAL VARIABLE IN CONSTRUCTOR
 {
//this.id=id;//GLOBAL VARIABLE can be selected by this method
//this.Name=Name;//GLOBAL VARIABLE
 }
void show()
 {
System.out.println(id+" "+Name);	
 }
public static void main(String[] args) {
	Student s=new Student(101,"Rahul");//OBJECT S CREATED WITH PARAMETER ALLOCATION	
    Student d=new Student(102,"XYZ");//Object d created with parameter allocation
    s.show();
    d.show();
}
}