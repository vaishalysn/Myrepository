package conditionalstatements;

import java.util.Scanner;

public class Breakvscontinue {

	public static void main(String[] args) {
		/*for(int i=1;i<=10;i++)
		{
			if(i==6)
			{
				break;
			}
			System.out.println(i);
		}*/
		for(int i=1;i<=10;i++)
		{
			if(i==9)
			{
				continue;
			}
			System.out.println(i);
		}
		
	}

}
