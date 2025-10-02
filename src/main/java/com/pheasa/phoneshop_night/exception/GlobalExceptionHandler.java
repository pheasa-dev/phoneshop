package com.pheasa.phoneshop_night.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ApiException.class)
	public ResponseEntity<?> handlerApiException(ApiException e){
		ErrorRespone errorRespone = new ErrorRespone(e.getHttpStatus(), e.getMessage());
		return ResponseEntity
				.status(e.getHttpStatus())
				.body(errorRespone);
	}
}
	