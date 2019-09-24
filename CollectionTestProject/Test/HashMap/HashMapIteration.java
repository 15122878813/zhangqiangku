package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
//hashmap的迭代
public class HashMapIteration {
	
	public static void main(String[] args) {
		HashMap<Object, Object> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		map.put("5", "5");
		Set<Entry<Object, Object>> entrySet = map.entrySet();
		//1.迭代器进行迭代
//		Iterator<Entry<Object, Object>> iterator = entrySet.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		//2.
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
		}
	}
}
