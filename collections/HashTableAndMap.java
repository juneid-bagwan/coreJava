package collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableAndMap {

	public static void main(String[] args) {
		Enumeration name;
		String key;
		Hashtable<Integer, String> ht=new Hashtable<Integer,String>();
		ht.put(100, "juneid");
		ht.put(101, "majeed");
		ht.put(102, "bagwan");
		System.out.println("------------------hash table----------------");
		for(Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("------------------hash map----------------");
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(100, "juneid");
		hm.put(101, "majeed");
		hm.put(102, "bagwan");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
