package com;

import java.io.Serializable;

public final class ImmutableClass implements Serializable {

	private static final long serialVersionUID = 1L;

	private String s;

	ImmutableClass() {
	}

	ImmutableClass(String s) {
		this.s = s;
	}

	public String getS() {
		return s;
	}
}
