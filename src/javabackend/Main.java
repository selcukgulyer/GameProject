package javabackend;


import javabackend.business.abstracts.CampaignsService;
import javabackend.business.abstracts.GameSellService;
import javabackend.business.abstracts.GameService;
import javabackend.business.abstracts.PlayersService;
import javabackend.business.concretes.CampaignsManager;
import javabackend.business.concretes.GameManager;
import javabackend.business.concretes.GameSellManager;
import javabackend.business.concretes.PlayersManager;
import javabackend.entities.concretes.Campaigns;
import javabackend.entities.concretes.Game;
import javabackend.entities.concretes.Players;


public class Main {

	public static void main(String[] args) {
		
		PlayersService oyuncu = new  PlayersManager();
		
		GameService oyun = new GameManager();
		
		CampaignsService kampanya = new CampaignsManager();
		
		
		
		
		Players selcuk = new Players(1,"Selçuk", "Gülyer", 1999,123123);
		oyuncu.add(selcuk);
		oyuncu.delete(selcuk);
		oyuncu.update(selcuk);
		
		Game fifa = new Game(1,"fifa",345);
		oyun.Gameadd(fifa);
		oyun.Gamedelete(fifa);
		
		Campaigns kampanya1 = new Campaigns("öðrenci",10);
		kampanya.CampaignAdd(kampanya1);
		kampanya.CampaignDelete(kampanya1);
		kampanya.CampaignUpdate(kampanya1);
		
		
		GameSellService Satilanoyun = new GameSellManager();
		Satilanoyun.satis(selcuk, fifa, kampanya1);
		
	
		
		
		
	

	}

}
