package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set=new HashSet();//Hashset will not necessarily maintain insertion sequence
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Four");//duplicate data does not gets stored
		Iterator<String> i=set.iterator();
		while(i.hasNext())
		{
		/*System.out.println(i.next().hashCode());*///to find the hashcode of data
			System.out.println(i.next());
		}

	}

}
