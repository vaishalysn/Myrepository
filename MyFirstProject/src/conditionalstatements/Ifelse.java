package conditionalstatements;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		/*int age=18;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not eligible to vote");
		}*/
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Age");
		int age=sc.nextInt();
		if(age>=18 && age<=75)
		{
			System.out.println("Eligible to vote");
		}
		else if(age>75)
		{
			System.out.println("You are Retired");
		}
			else
		{
			System.out.println("Not eligible to vote");
		}
	}
}

