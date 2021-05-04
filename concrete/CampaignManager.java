package concrete;

import Abstract.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign saved: " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign Delete: " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign Update: " + campaign.getName());
		
	}

}
