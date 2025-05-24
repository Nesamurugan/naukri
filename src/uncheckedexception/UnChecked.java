package uncheckedexception;
public class UnChecked {
	public void nullException() {
		String a = null;
		try {
			System.out.println(a.charAt(0)); //null value
		}
		catch(NullPointerException ex) {
			System.out.println("error details");
			System.out.println(ex);
		}
		finally {
			System.out.println();
		}
	}
	public void arithmetic_Exception() {
		System.out.println(5/0); //dividing by zero
	}
	
	public void string_Exception() {
		String str = "Batman";
		System.out.println(str.charAt(20)); //index out of bound 
	}
	
	public static void main(String[] args) {
		UnChecked obj = new UnChecked();
		obj.nullException();
		
		try {
			obj.arithmetic_Exception();
		}
		catch(ArithmeticException ex) {
			System.out.println("error details");
			System.out.println(ex);
		}
		
		try {
			obj.string_Exception();
		}catch(StringIndexOutOfBoundsException ex2) {
			System.out.println("shows where it has happened");
			ex2.printStackTrace();
		}
	}	
}
