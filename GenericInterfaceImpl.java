package com;

@CopyRight
public class GenericInterfaceImpl implements GenericInterface<String>{

	@Override
	public String getGenericType() {
		return "Hello World!";
	}
	
	public static void main(String[] args) {
		System.out.println(new GenericInterfaceImpl().getGenericType());
	}
	
}
