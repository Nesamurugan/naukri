package collectionss;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class setClass {
	public static void main(String[] args) {
		Set ref = new HashSet();
		ArrayList  ref2 = new ArrayList();
		
		//adding elements in hash set variable ref
		ref.add("java");
		ref.add("pyhton");
		ref.add("golang");
		ref.add("golang");
		//printing hashSet variable elements
		System.out.println(ref);
		
		//adding hash set elements to array list elements
		ref2.addAll(ref);
		System.out.println(ref2);
		
		//printing size of hash set
		int  a = ref.size();
		System.out.println(a);
		
		//removing elements in  hash set 
		ref.remove("string");
		System.out.println(ref);
		
		//checking if  hash set contains a certain element
		boolean b = ref.contains(6.0f);
		System.out.println(b);
		
		//looping hash set elements using for-each
		for(Object x: ref) {
			System.out.print(x+" ");
		}
		
		
	}
}
