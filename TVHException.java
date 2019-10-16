package com;

/**
 * This class is used to throw the TVH exception
 * @author Trisaiteja
 */
public class TVHException extends Exception {

	private static final long serialVersionUID = 1L;

	private String message;

	public TVHException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}
}
