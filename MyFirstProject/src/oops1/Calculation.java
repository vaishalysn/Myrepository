package oops1;

class Calculation
{
 static int add(int a,int b)
{
return a+b;	
}
 static int add(int a, int b, int c)
{
return a+b+c;	
}
 
 public static void main(String[] args) {
	 Calculation c=new Calculation();
	 int y =c.add(2,3,6);
	 System.out.println(y);
 }
}
/*{
double CalculateInterest(int P, double r,int t)
{
double s;
s=(P*r*t)/100;
return s;
}
public static void main(String[] args) {

Calculation c=new Calculation();

System.out.println(c.CalculateInterest(1000, 2.5, 4));

double a=0;
a= 1000+c.CalculateInterest(10000, 8.5, 6);
System.out.println(a);

}*/