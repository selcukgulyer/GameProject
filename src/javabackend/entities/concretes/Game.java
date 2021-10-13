package javabackend.entities.concretes;

public class Game {
	private int gameId;
	 private String gameName;
	 private int unittPrice;
	
	public Game(int gameId, String gameName, int unittPrice) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.unittPrice = unittPrice;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getUnittPrice() {
		return unittPrice;
	}
	public void setUnittPrice(int unittPrice) {
		this.unittPrice = unittPrice;
	}


}
