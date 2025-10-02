package com.pheasa.phoneshop_night.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorRespone {
	private HttpStatus status;
	private String message;
}
