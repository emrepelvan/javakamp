package concrete;

import abstracts.CampaignService;
import abstracts.SalesService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SalesManager implements SalesService {
	
	private CampaignService campaignService;

	public SalesManager(CampaignService campaignService) {
		
		this.campaignService = campaignService;
	}
	
	

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getName() + " oyunu" + " " +gamer.getFirstName() + " " + gamer.getLastName() + " kullan�c�s�na sat�ld�.");
	}

	@Override
	public void campaignSale(Game game, Campaign campaign) {
		if(this.campaignService.campaignStatus()) {
			System.out.println(game.getName() + " isimli oyununa" + campaign.getCampaignName() + " isimli kampanya uyguland� ve indirim uyguland�.") ;
		}
		else {
			System.out.println(game.getName() + "oyun sat��� ger�ekle�tirildi.");
		}
		
	}

}
