package entities;

import java.util.Date;

public class Campaign {

	private int campaignId;
	private int gameId;
	private String name;
	private String description;
	private Date creationDate;
	
	public Campaign() {
		
	}

	public Campaign(int campaignId, int gameId, String name, String description, Date creationDate) {
		super();
		this.campaignId = campaignId;
		this.gameId = gameId;
		this.name = name;
		this.description = description;
		this.creationDate = creationDate;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
	
	
}
