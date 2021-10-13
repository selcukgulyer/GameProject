package javabackend.business.abstracts;


import javabackend.entities.concretes.Campaigns;
import javabackend.entities.concretes.Game;
import javabackend.entities.concretes.Players;

public interface GameSellService {
	
	public void satis(Players players,Game game,Campaigns campaign);

}
