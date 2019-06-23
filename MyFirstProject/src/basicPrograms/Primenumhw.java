package basicPrograms;

import java.util.Scanner;

public class Primenumhw {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
	    int b=number/2;
	    System.out.println(b);
	    
	    boolean status=false;
	    
        for(int i=2;i<=b;i++)
        {
        	
        	if(number % i == 0)
        	{
        		status=true;
        		 break;
        	} 	
        }
  
         
        if(status==true)
        {
        	System.out.println("Number is not prime");
        }
        else
        {
        	System.out.println("Number is prime");
        }

	}
	}
