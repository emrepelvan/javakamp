package gameProjectHomework;

import concrete.CampaignManager;
import concrete.GameManger;
import concrete.GamerCheckManager;
import concrete.GamerManager;
import concrete.SalesManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game(1,"CS:GO",175);
		
		Gamer gamer1 = new Gamer(1,"Emre","Pelvan",1989,"22445656421");
		Gamer gamer2 =new Gamer();

		gamer2.setId(2);
		gamer2.setFirstName("Hakan");
		gamer2.setLastName("Taþýyan");
		gamer2.setBirtOfDay(1990);
		gamer2.setNationalityId("1111111111");
		
		Campaign campaign = new Campaign(1," Yüzyýlýn kampanyasý",50);
		
		GamerManager gamerManager =new GamerManager(new GamerCheckManager());
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);
		
		System.out.println("------------------------------------------");
		
		GameManger gameManager = new GameManger();
		gameManager.add(game);
		
		System.out.println("------------------------------------------");
		
		SalesManager salesManager = new SalesManager(new CampaignManager());
		salesManager.sale(game, gamer1);
		
		System.out.println("------------------------------------------");
		
		salesManager.campaignSale(game, campaign);
		
		System.out.println("------------------------------------------");
		
		
	}

}
