package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SalesService {
	void sale(Game game, Gamer user);
	void campaignSale(Game game, Campaign campaign);
}
