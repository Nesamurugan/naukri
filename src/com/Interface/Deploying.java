package com.Interface;

public class Deploying implements Interface2,Interface1 {

	@Override
	public void uiux() {
		System.out.println("ui/ux using react");		
	}

	@Override
	public void backend() {
		System.out.println("backend using java Spirngboot");
		
	}

	@Override
	public void cloudService() {
		System.out.println("cloud service using AWS");
		
	}

	@Override
	public void testing() {
		System.out.println("testing using Selenium");
		
	}
	public static void main(String[] args) {
		Deploying obj = new Deploying();
		obj.uiux();
		obj.backend();
		obj.cloudService();
		obj.testing();
	}

}
