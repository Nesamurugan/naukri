package collectionss;

import java.util.ArrayList;
import java.util.List;

public class ListClass2 {
	public static void main(String[] args) {
		System.out.println("arrayList with similar datatype(generics)");
		List<Integer> var = new ArrayList<Integer>();
		
		var.add(5);
		var.add(2);
		var.add(3);
		var.add(5);
		
		System.out.println();
		for(int x: var) {
			//printing index of values in array list ->var
			System.out.print(var.indexOf(x)+" ");
		}
		System.out.println();
		//inserting element in index 1
		
		var.set(1, null);
		System.out.println(var);
		
		//getting index of first occurence of element
		int a = var.indexOf(5);
		System.out.println(a);
		
		//getting index of last occurence if element
		int b = var.lastIndexOf(5);
		System.out.println(b);
		
		//checking if it contains a certain element
		boolean c = var.contains(10);
		System.out.println(c);
	}
}
