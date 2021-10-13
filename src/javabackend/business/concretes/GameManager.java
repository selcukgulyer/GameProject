package javabackend.business.concretes;

import javabackend.business.abstracts.GameService;
import javabackend.entities.concretes.Game;

public class GameManager implements GameService {

	@Override
	public void Gameadd(Game game) {
		System.out.println(game.getGameName()+" oyunu eklendi");
		
	}

	@Override
	public void Gamedelete(Game game) {
		System.out.println(game.getGameName()+" oyunu silindi");
	}




	
}
