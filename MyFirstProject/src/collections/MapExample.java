package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {//does not maintain insertion order
	/*	Map<Integer,String> map=new HashMap<Integer,String>();//Map cannot be traverse without converting to set
		map.put(null,"Rahul");//hashmap can have only one null key i.e no duplication
		map.put(101, "Ranjan");//each key-value combination is called entry
		map.put(102, "Ranjit");
		map.put(103, null);//hashmap can have many null values i.e duplication allowed
		map.put(104, null);
		map.put(104, "parineeti");
		map.put(null, "Gurmeet");
		for(Map.Entry m:map.entrySet())//
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		//map.put(null,"Rahul");null key cannot be put
		map.put(101, "Ranjan");
		map.put(102, "Ranjit");
		map.put(103, null);//only one null value will come
		map.put(104, null);
		map.put(104, "parineeti");
		//map.put(null, "Gurmeet");
		for(Map.Entry<Integer,String> m:map.entrySet())//
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
