package concrete;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " isimli kampanya eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " isimli kampanya gŁncellendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " isimli kampanya silindi.");
	}

	@Override
	public boolean campaignStatus() {
		
		return true;
	}

}
