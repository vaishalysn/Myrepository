package basicPrograms;

public class Numreverse {

	public static void main(String[] args) {
		
		int c=12346;
		int a=c;
		int b=0;
		int n;
		while(a>=1)
		{
			n=a%10;
			System.out.println("n is "+n);
			a=a/10;
			System.out.println("a is "+a);
			b=b*10+n;
			System.out.println("b is "+b);	
		}
	}
}
	
			//System.out.println("b is " +b);
			
/*if(c==b)
{
	System.out.println("Palindrome");
	
}
else
	{
		System.out.println("Not a Palindrome");
	}
}
}*/