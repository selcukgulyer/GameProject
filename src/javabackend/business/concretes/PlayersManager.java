package javabackend.business.concretes;

import javabackend.business.abstracts.PlayersService;
import javabackend.entities.concretes.Players;

public class PlayersManager implements PlayersService {

	@Override
	public void add(Players players) {
		
		System.out.println(players.getFirstName()+" m��teri eklendi");
		
	}

	@Override
	public void delete(Players players) {
		
		System.out.println(players.getFirstName()+" m��teri silindi");
	}

	@Override
	public void update(Players players) {
		System.out.println(players.getFirstName()+" m��teri g�ncellendi");
		
	}



	



}
