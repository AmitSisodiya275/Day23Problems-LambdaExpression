package com.bridgelab.day23problem.uservalidation;


public class InvalidEntryException extends Exception{

	ExceptionType type;

	public InvalidEntryException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

	enum ExceptionType{
		ENTERED_NULL, ENTERED_EMPTY, ENTERED_WRONG;
	}

}

