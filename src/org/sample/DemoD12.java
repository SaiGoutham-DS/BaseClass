package org.sample;

public class DemoD12 implements DemoD   {
	
	@Override
	public void manager() {
		
		System.out.println("Manager age: "+ age);
		
	}
	

	public static void main(String[] args) {
		
		DemoD12 s = new DemoD12();
		s.manager();
		DemoD.employee();
		
		
	}
		

	}


