package javabackend.business.concretes;

import javabackend.business.abstracts.CampaignsService;
import javabackend.entities.concretes.Campaigns;

public class CampaignsManager implements CampaignsService {

	@Override
	public void CampaignAdd(Campaigns campaigns) {
		System.out.println(campaigns.getCampaignsName()+" kampanyas� eklendi");
		
	}

	@Override
	public void CampaignDelete(Campaigns campaigns) {
		System.out.println(campaigns.getCampaignsName()+" kampanyas� silindi");
		
	}

	@Override
	public void CampaignUpdate(Campaigns campaigns) {
		System.out.println(campaigns.getCampaignsName()+" kampanyas� g�ncellendi");
		
	}

}
