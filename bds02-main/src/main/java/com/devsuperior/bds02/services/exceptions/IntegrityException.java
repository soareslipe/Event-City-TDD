package com.devsuperior.bds02.services.exceptions;

public class IntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public IntegrityException(String msg) {
		super(msg);
	}

}
