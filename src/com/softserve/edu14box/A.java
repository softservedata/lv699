package com.softserve.edu14box;

import java.io.Serializable;

public class A implements Serializable {
    
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "A [getClass()=" + getClass()
			+ ", hashCode()=" + hashCode()
			+ ", toString()" + "]";
	}

}