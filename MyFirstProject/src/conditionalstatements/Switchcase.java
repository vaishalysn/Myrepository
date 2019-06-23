package conditionalstatements;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		switch(x)
		{
		case 1:
		System.out.println("Performance is poor");
		break;
		case 2:
		System.out.println("Slow performer");
		break;
		default:System.out.println("Invalid");
		sc.close();
		}
	}

}
