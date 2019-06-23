package basicPrograms;

import java.util.Scanner;

public class Oddnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
		int n;
			n=number%2;
			if(n==0)
			{
				System.out.println("Number is Even");
			}
			else
			{
				System.out.println("Number is Odd");
			}
		
	}

}
