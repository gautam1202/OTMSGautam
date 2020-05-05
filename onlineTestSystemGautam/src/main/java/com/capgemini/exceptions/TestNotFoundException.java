package com.capgemini.exceptions;

public class TestNotFoundException extends RuntimeException {
	public TestNotFoundException(String msg)
	{
		super(msg);
	}
}