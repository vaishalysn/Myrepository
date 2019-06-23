package stringex;

public class Immutable {

	public static void main(String[] args) {
	String s="Vaishaly";
	s.concat("Nigam");//concat() method appends the string at the end as the strings are immutable objects
	//this creates a concated value as Vaishaly Nigam but no reference is created
	System.out.println(s);
	s=s.concat("Nigam");//not recommended as it changes original string
    System.out.println(s);
	}

}
