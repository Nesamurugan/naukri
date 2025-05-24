package mapInterface;
import java.util.Map;
import java.util.Map.Entry;
import com.mypackage.Main;
import java.util.LinkedHashMap;

public class Linked_Hash_Map {
	public void method() {
		Map<Object,Object> ref = new LinkedHashMap<>();
		ref.put("product", "laptop");
		ref.put(1,"dell");
		ref.put(null, "asus");
		ref.put("mouse", null);
		ref.put(null,"hcl");//adding duplicate null key
		ref.put("graphics_card",null);//adding duplicate null value
		//printing linked hash map
		System.out.println(ref);
		
		//check if it contains a key
		boolean var = ref.containsKey("mouse");
		System.out.println(var);
		
		//check if it contains a value
		boolean var1 = ref.containsValue(null);
		
		//looping linked hash map key-value
		for(Entry<Object, Object> y:ref.entrySet()) {
			System.out.print("entrySet: "+y+" ");
		}
		System.out.println();
		//looping keys
		int count = 1;
		for(Object x : ref.keySet()) {
			System.out.println("key"+count+" "+x);
			count++;
		}
		
	}
	public static void main(String[] args) {
		Linked_Hash_Map obj = new Linked_Hash_Map();
		obj.method();
	}
}
