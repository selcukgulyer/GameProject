package javabackend.business.abstracts;

import javabackend.entities.concretes.Campaigns;

public interface CampaignsService {
	public void CampaignAdd(Campaigns campaigns);
	public void CampaignDelete(Campaigns campaigns);
	public void CampaignUpdate(Campaigns campaigns);

}
