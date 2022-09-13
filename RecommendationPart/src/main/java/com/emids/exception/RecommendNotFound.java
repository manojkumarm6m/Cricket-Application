package com.emids.exception;

public class RecommendNotFound extends Exception{
	
	private String message;

	public RecommendNotFound() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecommendNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public RecommendNotFound(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RecommendNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RecommendNotFound(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RecommendNotFound [message=" + message + "]";
	}
	
}
