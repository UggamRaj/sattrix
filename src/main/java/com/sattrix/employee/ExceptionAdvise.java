package com.sattrix.employee;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvise {

	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<String> controllerException(EmployeeException exception){
		String str=exception.getMessage();
		return new ResponseEntity<String>(str, HttpStatus.NOT_FOUND);
	}
}
