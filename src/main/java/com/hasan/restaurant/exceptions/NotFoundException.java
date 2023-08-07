package com.hasan.restaurant.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "no such user")

public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

}