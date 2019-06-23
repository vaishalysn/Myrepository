package stringex;

public class CompareTo {

	public static void main(String[] args) {
	String s1="Dharmaah";
	String s2="Kumar";
	String s3="Hello";
	String s4="zara tasveer se";
	String s5="bol do na zara";
	String s6="Helmet";
	String s7="dharmaah";
	String s8="";
	String s9="Helloa";
	System.out.println(s1.compareTo(s2));
	System.out.println(s2.compareTo(s1));
	System.out.println(s3.compareTo(s6));
	System.out.println(s4.compareTo(s5));
	System.out.println(s3.compareTo(s6));
	System.out.println(s1.compareTo(s7));
	System.out.println(s1.compareTo(s8));
	System.out.println(s3.compareTo(s9));

	}

}
