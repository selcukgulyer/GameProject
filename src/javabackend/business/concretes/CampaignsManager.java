package javabackend.business.concretes;

import javabackend.business.abstracts.CampaignsService;
import javabackend.entities.concretes.Campaigns;

public class CampaignsManager implements CampaignsService {

	@Override
	public void CampaignAdd(Campaigns campaigns) {
		System.out.println(campaigns.getCampaignsName()+" kampanyasý eklendi");
		
	}

	@Override
	public void CampaignDelete(Campaigns campaigns) {
		System.out.println(campaigns.getCampaignsName()+" kampanyasý silindi");
		
	}

	@Override
	public void CampaignUpdate(Campaigns campaigns) {
		System.out.println(campaigns.getCampaignsName()+" kampanyasý güncellendi");
		
	}

}
