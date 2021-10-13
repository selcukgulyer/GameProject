package javabackend.business.concretes;

import javabackend.business.abstracts.GameSellService;
import javabackend.entities.concretes.Campaigns;
import javabackend.entities.concretes.Game;
import javabackend.entities.concretes.Players;

public class GameSellManager implements GameSellService  {

	

	@Override
	public void satis(Players players, Game game, Campaigns campaign) {
		
		double yenifiyat= game.getUnittPrice() - (game.getUnittPrice()*campaign.getCampaignsPrice()/100);
	
		System.out.println(players.getFirstName()+" oyuncuya " + game.getGameName()+" oyunu "+ yenifiyat+ " bu fiyata satýlmýþtýr ");
		
	}
		
}
