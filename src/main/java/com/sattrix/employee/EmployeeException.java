package com.sattrix.employee;

public class EmployeeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EmployeeException() {
		
	}

	public EmployeeException(String msg) {
		super(msg);
	}
	public EmployeeException(String msg,Throwable th) {
		super(msg,th);
	}
}
