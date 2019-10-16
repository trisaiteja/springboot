package com;

@CopyRight
public class CustomExceptionLogic {

	public static void main(String[] args) throws CustomException {

		int x =1;
		
		try {
			if(x == 1) {
				throw new CustomException("User defined exception.");
			}
		} finally {
			System.out.println("Executed.");
		}

	}
}
