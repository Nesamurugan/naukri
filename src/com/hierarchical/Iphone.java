package com.hierarchical;

public class Iphone extends Mobile {
	String body = "metal";
	String camera = "150MP";
	String os = "ios";
	public void iphoneMethod() {
		System.out.println("iphone class method");
		System.out.println("screen: "+screen+"\n"+
							"batterymah: "+batteryMAh+"\n"+
							"camera: "+camera+"\n"+"os: "
							+os);
	}
	
	public static void main(String[] args) {
		Iphone obj = new Iphone();
		obj.iphoneMethod();
		System.out.println();
		obj.mobileMethod();
	}
}
