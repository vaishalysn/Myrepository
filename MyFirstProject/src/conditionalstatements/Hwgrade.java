package conditionalstatements;

import java.util.Scanner;

public class Hwgrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Marks");
		int marks=sc.nextInt();
		if(marks>=90 && marks<=100)
			{
			System.out.println("Grade A");
			}
		else if(marks>=80 && marks<90)
		{
			System.out.println("Grade B");
		}
		else if(marks>=70 && marks<80)
		{
			System.out.println("Grade C");
		}
		else if(marks>=60 && marks<70)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
