package entities;

public class Sale {

	private int id;
	private int userId;
	private int gameId;
	private int campaignId;
	
	public Sale() {
		
	}

	public Sale(int id, int userId, int gameId, int campaignId) {
		super();
		this.id = id;
		this.userId = userId;
		this.gameId = gameId;
		this.campaignId = campaignId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
}
