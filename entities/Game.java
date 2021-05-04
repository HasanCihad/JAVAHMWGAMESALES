package entities;

public class Game {
	
	private int gameId;
	private String name;
	private String description;
	private double price;
	
	public Game() {
		
	}

	public Game(int gameId, String name, String description, double price) {
		super();
		this.gameId = gameId;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
