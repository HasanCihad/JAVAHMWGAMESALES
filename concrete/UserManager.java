package concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import entities.User;
import models.Result;
import utils.CheckServiceUtils;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {

		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		Result result = CheckServiceUtils.runCheckServices(new Result[] {userCheckService.CheckIfRealPerson(user)});
		
		if(!result.isSuccess()) {
			System.out.println(result.getMessage());
			return;
		}
		
		System.out.println("Saved Success");
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Update: " + user.getFirstName() + " " + user.getLastName());
		
	}

}
