package ravitestpkg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Hashdemo {

	public static void main(String[] args) {
 
		HashMap<Integer,String>  map = new HashMap<>();
		map.put(1, "ravi");
		map.put(2, "aaradhya");
		System.out.println(map);
		
		// itertaing through hashmap method 1
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
         
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key + " " + value);
			// itertaing through hashmap method 2		
			Set<Entry<Integer,String>> entrykeyvalue = map.entrySet();
			Iterator<Entry<Integer,String>> itr2 = entrykeyvalue.iterator();
			while(itr2.hasNext()) {
				Entry<Integer,String> entry = itr2.next();
				System.out.println(entry.getKey() + entry.getValue());
				
			}
			
			
		}
		
	}

}
