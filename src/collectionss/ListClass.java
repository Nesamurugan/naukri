package collectionss;
import java.util.ArrayList;
import java.util.List;

public class ListClass {
	public static void main(String[] args) {
		List ref = new ArrayList();
		ArrayList ref2 = new ArrayList();
		//adding elements in array list variable ref
		ref.add(10);
		ref.add('a');
		ref.add("hello");
		ref.add(true);
		ref.add(7.5f);
		System.out.println(ref);
		
		//adding elements in array list variable ref2
		ref2.add(10);
		ref2.add('a');
		ref2.add("good day");
		System.out.println(ref2);
		
		System.out.println("looping arraylist of dissimilar datatype");
		for(int i = ref.size()-1; i>=0; --i) {
			System.out.print(ref.get(i)+ ",");
		}
		System.out.println();
		//remove the element in  index 3
		ref.remove(3);
		System.out.println(ref);
		
		//check if the arrayList is empty
		boolean a = ref.isEmpty();
		System.out.println(a);
		//checking if it contains certain elements
		boolean b = ref.contains('a');
		System.out.println(b);
		
		//keeping elements in arraylist variable ref2 that are also in arraylist variable ref
		ref2.retainAll(ref);
		System.out.println(ref2);
	}	

}
