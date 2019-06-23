package basicPrograms;

public class Localversusglobal {
int a;
static int b;
static boolean s;
	public static void main(String[] args) 
	{
	//System.out.println(a);
	int b=5;
	System.out.println(b);
	System.out.println(s);
	System.out.println(Localversusglobal.b);
	

	}

}
