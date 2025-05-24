package constructor_chaining;

public class Chain_Const {
	float cgpa;
	int contact_no;
	
	public Chain_Const() {
		System.out.println("Login Form");
		System.out. println("--------");
	}
	
	public Chain_Const(String name) {
		this();
		System.out.println("First name :"+name);
	}
	
	public Chain_Const(String lname ,int Stu_id) {
		this("Nesa");
		System.out.println("Last name :"+lname);
		System.out.println("Student ID :"+Stu_id);
	}
	
	public Chain_Const(int age , long year) {
		this("Murugan",123);
		System.out.println("Student Age :"+age);
		System.out.println("Passed Out :"+year);
	}
	
	public Chain_Const(float cgpa,int contact_no ) {
		this(26,2020l);
		this.cgpa = cgpa;
		this.contact_no = contact_no;
		System.out.println("cgpa: "+this.cgpa);
	}
	
	public static void main(String[] args) {
		Chain_Const cc = new Chain_Const(7.0f,7777);
		System.out.println("contact_no: "+cc.contact_no);
	}
}