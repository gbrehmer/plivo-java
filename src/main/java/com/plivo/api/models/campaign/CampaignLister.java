package com.plivo.api.models.campaign;

import com.plivo.api.models.base.ListResponse;
import com.plivo.api.models.base.Lister;
import com.plivo.api.util.Utils;
import retrofit2.Call;
import com.plivo.api.models.campaign.Campaign;

public class CampaignLister extends Lister<Campaign> {
  private Integer limit;
  private Integer offset;

  public CampaignLister limit(Integer limit) {
    this.limit = limit;
    return this;

  }

  public CampaignLister offset(Integer offset) {
    this.offset = offset;
    return this;

  }

  @Override
  protected Call<ListResponse<Campaign>> obtainCall() {
    return client().getApiService().campaignList(client().getAuthId(), toMap(), limit, offset);
  }
}
