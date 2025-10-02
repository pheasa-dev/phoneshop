package com.pheasa.phoneshop_night.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ApiException extends RuntimeException{
	private final HttpStatus httpStatus;
	private final String message;
}
