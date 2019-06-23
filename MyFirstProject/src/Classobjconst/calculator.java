package Classobjconst;

class calculator {
	
	int x=90;
	int y=100;
	void sum()//sum is method
	{
	int a=90;
	int b=100;
	int c=a+b;
	System.out.println("Sum of two number is"+c);
    }
	public static void main(String[] args) {
	calculator c=new calculator();//c is object created
	System.out.println(c.x);
	System.out.println(c.y);
	c.sum();
	
	

		

	}

}
