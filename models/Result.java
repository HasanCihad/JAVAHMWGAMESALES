package models;

import Abstract.ResultS;

public class Result implements ResultS{
	
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success = success;
	}
	
	public Result(boolean success, String message) {
		this(success);
		this.message = message;
	}

	@Override
	public boolean isSuccess() {
		return success;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
