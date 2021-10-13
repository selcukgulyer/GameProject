package javabackend.entities.concretes;

public class Campaigns {
	private	String campaignsName;
	private int campaignsPrice;

	public Campaigns(String campaignsName, int campaignsPrice) {
		super();
		this.campaignsName = campaignsName;
		this.campaignsPrice = campaignsPrice;
	}
	public String getCampaignsName() {
		return campaignsName;
	}
	public void setCampaignsName(String campaignsName) {
		this.campaignsName = campaignsName;
	}
	public int getCampaignsPrice() {
		return campaignsPrice;
	}
	public void setCampaignsPrice(int campaignsPrice) {
		this.campaignsPrice = campaignsPrice;
	}
		
	
}
