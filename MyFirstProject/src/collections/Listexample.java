package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Listexample {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("wipro");
		al.add("Infosys");
		al.add("TCS");
		al.add("TechMahindra");
		al.add("wipro");//duplicate data is stored
		System.out.println("This is my ArrayList:"+al);//List follows insertion sequence
		//Method1 for each loop to traverse through data in forward direction only
		/*for(String s:al)
		{
			System.out.println(s);
		}
		*/
		//Method2 Iterator interface to traverse through data in forward direction only
		/*Iterator<String> itr=al.iterator();//Here "itr" points to the "al"
		while(itr.hasNext())//hasNext returns true if iterator has more elements
		{
			System.out.println(itr.next());//next returns the element and move cursor to next element
		}*/
		//Method3 to traverse through element first in forward and then in reverse directions
		/*ListIterator<String> itr=al.listIterator();
		System.out.println("Traverse in forward direction");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Traverse in reverse direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}*/
		System.out.println(al.contains("wipro"));//to check if any element is present or not
		List<String> al2=new LinkedList<String>();
		al2.add("Bangalore");
		al2.add("Bhagalpur");
		al2.add("Kolkata");
		al2.add("Haldia");
		System.out.println("This is my LinkedList:"+al2);
		/*for(String b:al2)
		{
			System.out.println(b);
		}*///for each to traverse through data
		/*Iterator<String> itr2=al2.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}*/
		
	}

}
