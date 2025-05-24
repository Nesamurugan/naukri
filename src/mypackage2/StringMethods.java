package mypackage2;

public class StringMethods {
	public void methods() {
		String x = "good morning @123";
		String str = "2-3-4-5";
		String str2 = "  java   ";
		String str3 = " i love java and java is great";
		String str4 = "HAPPY PONGAL";
		boolean a = x.isEmpty();
		System.out.println("x.isEmpty() -> "+ a);
		System.out.println();
		
		System.out.println("value of str: "+ str);
		String[] b = str.split("-");
		System.out.println("------returned String of str.split()------");
		for(String i : b) {
			System.out.print(i);
		}
		System.out.println();
		
		System.out.println("before trimming using.trim(): " + str2);
		String c = str2.trim();
		System.out.println("after trimming using .trim(): " + c);
		System.out.println();
		
		System.out.println("before replacing str using .replace(): "+ str);
		String d = str.replace("-","*");
		System.out.println("after replacing str using .replace(): "+ d);
		System.out.println();
		 
		System.out.println("value of str3: "+ str3);
		int  e = str3.lastIndexOf("java");
		System.out.println("index of last occurence  of java using .lastIndexOf(): "+e);
		System.out.println();
		
		System.out.println("value of str4: "+str4);
		String f = str4.toLowerCase();
		System.out.println("using .toLoweCase() on str4: "+f);
		System.out.println();
        System.out.println("value of x: "+x);
		boolean g = x.endsWith("3");
		System.out.println("x.endsWith(\"3\")= "+ g);
	}
	
	public static void main(String[] args) {
		StringMethods obj = new StringMethods();
		obj.methods();
	}
}
