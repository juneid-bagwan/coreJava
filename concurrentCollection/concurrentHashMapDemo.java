package concurrentCollection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class concurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap <String,String> cmap=new ConcurrentHashMap<String,String>(); 
		cmap.put("key 1", "value 1");
		cmap.put("key 2", "value 2");
		cmap.put("key 3", "value 3");
		cmap.put("key 4", "value 4");
		for(Map.Entry<String, String>map:cmap.entrySet()) {
			System.out.println(map.getKey()+"\t"+map.getValue());
		}
	}

}
