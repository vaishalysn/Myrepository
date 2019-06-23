package conditionalstatements;

public class Maxnum {

	public static void main(String[] args) {
		int a=5;
		int b=7;
		int c=3;
		if(a>b && a>c)
		{	System.out.println("Maximum number is " +a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Maximum number is " +b);
		}
		else
		{
			System.out.println("Maximum number is " +c);
		}
	}

}
