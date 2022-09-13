package com.emids.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = RecommendNotFound.class)
	public ResponseEntity<String> recommendNotFound(RecommendNotFound e){
		return new ResponseEntity<String>("Recommend Not Found in the database",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value = RecommendAlreadyExists.class)
	public ResponseEntity<String> recommendAlreadyExits(RecommendAlreadyExists e){
		return new ResponseEntity<String>("Recommend Already Exists in the database",HttpStatus.CONFLICT);
	}
}
