package concrete;

import Abstract.SaleService;
import entities.Game;
import entities.User;

public class SaleManager implements SaleService{

	@Override
	public void sale(User user, Game game) {
		System.out.println(user.getFirstName() + "User " + game.getName() + "a buy.");
		
	}

	
}
