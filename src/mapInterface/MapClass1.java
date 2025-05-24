package mapInterface;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapClass1 {
	public void hashMap() {
		Map<Integer,String> ref =  new HashMap();
		ref.put(1, "vivo");
		ref.put(2, "samsung");
		ref.put(3, "apple");
		ref.put(null, "xiaomi");
		ref.put(null, "nothing"); //adding duplicate null key
		ref.put(4, null);
		ref.put(5,null); //adding duplicate null value
		
		//printing elements in hash map
		System.out.println(ref);
		//accessing elements in hash map
		System.out.println(ref.get(1));
		//printing size of Hash map 
		System.out.println("size: "+ref.size());
		//removing elements in hash map
		ref.remove(4);
		System.out.println(ref);
		//retrieving all keys 
		Set<Integer> var = ref.keySet();
		System.out.println("keys: "+var);
		//retrieving all values
		Collection<String> var1 = ref.values();	
		System.out.println("values: "+var1);
		//
		Set<Entry<Integer, String>> entry = ref.entrySet();
		System.out.println(entry);
	}
	
	public static void main(String[] args) {
		MapClass1 obj = new MapClass1();
		obj.hashMap();
	}
}