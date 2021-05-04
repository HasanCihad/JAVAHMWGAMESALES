package concrete;

import Abstract.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Saved: " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Delete: " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Update: " + game.getName());
		
	}

}
