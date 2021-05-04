package utils;

import models.Result;

public class CheckServiceUtils {

	public static Result runCheckServices(Result[] userCheckServices) {
		for(Result userCheckService : userCheckServices) {
			if(!userCheckService.isSuccess()) {
				return userCheckService;
			}
		}
		
		return new Result(true);
		
	}
}
