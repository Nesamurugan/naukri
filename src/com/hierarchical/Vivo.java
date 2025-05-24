package com.hierarchical;

public class Vivo extends Mobile {
	 String camera = "100Mp";
	 String os = "android";
	 
	 public void vivoMethod() {
		System.out.println("vivo class method");
		System.out.println("screen: "+screen+"\n"+
							"batterymah: "+batteryMAh+"\n"+
							"camera: "+camera+"\n"+"os: "
							+os);
	 }
	 public static void main(String[] args) {
		Vivo obj = new Vivo();
		obj.vivoMethod();
		System.out.println();
		obj.mobileMethod();
	}
}