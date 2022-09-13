package com.emids.exception;

public class RecommendAlreadyExists extends Exception {


	private String message;

	public RecommendAlreadyExists() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecommendAlreadyExists(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public RecommendAlreadyExists(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RecommendAlreadyExists(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RecommendAlreadyExists(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RecommendAlreadyExists [message=" + message + "]";
	}
	
	
}
