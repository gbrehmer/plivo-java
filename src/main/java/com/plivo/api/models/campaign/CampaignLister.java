package com.plivo.api.models.campaign;

import com.plivo.api.models.base.ListResponse;
import com.plivo.api.models.base.MessagingCampaignLister;
import com.plivo.api.util.Utils;
import retrofit2.Call;
import com.plivo.api.models.campaign.Campaign;

public class CampaignLister extends MessagingCampaignLister<Campaign> {
  private Integer limit;
  private Integer offse
  private String campaignSource;

  public CampaignLister limit(Integer limit) {
    this.limit = limit;
    return this;

  }

  public CampaignLister offset(Integer offset) {
    this.offset = offset;
    return this;

  }
  public CampaignLister campaignSource(String campaignSource) {
    this.campaignSource = campaignSource;
    return this;

  }

  @Override
  protected Call<ListResponse<Campaign>> obtainCall() {
    return client().getApiService().campaignList(client().getAuthId(), toMap(), limit, offset, campaignSource);
  }
}
