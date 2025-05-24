package abstract_package;

public class A {
	public static void method(String x) {
		boolean a = x.equalsIgnoreCase("HELLO");
	}
	
	public static void main(String[] args) {
		method("");
	}
}
