package pack1;

public class Demo1 {
	private void m1()
	{
	System.out.println("I am private");	
	}
	public void m2()
	{
		System.out.println("I am default");
	}
	protected void m3()
	{
		System.out.println("I am protected");
	}
	public static void main(String[] args) {
		Demo1 a=new Demo1();
		a.m1();

	}

}
