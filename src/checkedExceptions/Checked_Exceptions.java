package checkedExceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
public class Checked_Exceptions  {
	public void ioException(){
		try {
			FileReader file = new FileReader("secret.txt");
		} catch (FileNotFoundException e) {
			System.out.println("file cannot be found");
			System.out.println(e);
		}finally {
			System.out.println();
		}
	}
	
	public void sql_exception() throws SQLException {
		
		throw new SQLException("cannot connect to database");
	}
	
	public void methodCall() { //calling the below class_exception method 
		try {
			class_Exception();
		} catch (ClassNotFoundException ex) {
			System.out.println("printing stack trace");
			ex.printStackTrace();
		}
	}

	public void class_Exception() throws ClassNotFoundException {
		throw new ClassNotFoundException("message: no such class exist");
	}
	
	public static void main(String[] args) {
		Checked_Exceptions obj = new Checked_Exceptions();
		obj.ioException();
		try {
			obj.sql_exception();
		} catch (SQLException e) {
			System.out.println(e);
		}
		obj.methodCall();
	}
}
