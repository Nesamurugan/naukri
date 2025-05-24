package mypackage2;

public class ClassString2 {
	public void Mutable(){
		System.out.println("******Mutable strings******");
		
		StringBuffer str1 = new StringBuffer("hello");
		StringBuffer str2 = new StringBuffer("hello");
		System.out.println("value of str1: " + str1);
		System.out.println("value of str2: " + str2);
		System.out.println();
		
		System.out.println("------before concatenating str1------");
		System.out.println("memory address of str1's value: " + System.identityHashCode(str1));
		System.out.println("memory address of str2's value: " + System.identityHashCode(str2));
		System.out.println("str1 reference == str2 reference ? -> " + (str1 == str2));
		System.out.println();
		
		System.out.println("------after concatenating str1------");
		str1 = str1.append(" world");
		System.out.println("value of str1: " + str1);
		System.out.println("value of str2: " + str2);
		System.out.println();
		
		System.out.println("memory address of str1's value: " + System.identityHashCode(str1));
		System.out.println("memory address of str2's value: " + System.identityHashCode(str2));
		System.out.println("str1 reference == str2 reference ? -> " + (str1 == str2));
	}
	
	public static void main(String[] args) {
		ClassString2 obj = new ClassString2();
		obj.Mutable();
	}
}
