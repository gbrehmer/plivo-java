package com.plivo.api.models.campaign;

import com.plivo.api.models.base.Creator;
import com.plivo.api.util.Utils;
import retrofit2.Call;

public class CampaignCreator extends Creator<CampaignCreateResponse> {
  private String brandID;
  private String campaignAlias;
  private String vertical;
  private String usecase;
  private String[] subUsecases;
  private String description;
  private Boolean embeddedLink;
  private Boolean embeddedPhone;
  private Boolean ageGated;
  private Boolean directLending;
  private Boolean subscriberOptin;
  private Boolean subscriberOptout;
  private Boolean subscriberHelp;
  private Boolean affiliateMarketing;
  private String sample1;
  private String sample2;
  private String sample3;
  private String sample4;
  private String sample5;
  private String url;
  private String method;
  
  CampaignCreator(String brandID,String campaignAlias,String vertical,String usecase,String[] subUsecases,String description,Boolean embeddedLink,Boolean embeddedPhone,Boolean ageGated,Boolean directLending,Boolean affiliateMarketing, Boolean subscriberOptin,Boolean subscriberOptout,Boolean subscriberHelp,String sample1,String sample2, String sample3,String sample4, String sample5 ,String url, String method) {
   
    this.brandID = brandID;
    this.campaignAlias = campaignAlias;
    this.vertical = vertical;
    this.usecase = usecase;
    this.subUsecases = subUsecases;
    this.description = description;
    this.embeddedLink = embeddedLink;
    this.embeddedPhone = embeddedPhone;
    this.ageGated = ageGated;
    this.directLending = directLending;
    this.subscriberOptin = subscriberOptin;
    this.subscriberOptout = subscriberOptout;
    this.subscriberHelp = subscriberHelp;
    this.affiliateMarketing = affiliateMarketing;
    this.sample2 = sample2;
    this.sample1 = sample1;
    this.sample3 = sample3;
    this.sample4 = sample4;
    this.sample5 = sample5;
    this.url = url;
    this.method = method;
  }

  public String brandID(){
      return this.brandID;
  }

  public String campaignAlias(){
      return this.campaignAlias;
  }

  public String vertical(){
      return this.vertical;
  }

  public String usecase(){
      return this.usecase;
  }

  public String description(){
      return this.description;
  }
  public String sample2(){
      return this.sample2;
  }
  public String sample1(){
      return this.sample1;
  }
  public String sample3(){
    return this.sample3;
  }
  public String sample4(){
    return this.sample4;
  }
  public String sample5(){
    return this.sample5;
  }
  public Boolean affiliateMarketing(){
    return this.affiliateMarketing;
}
  public Boolean subscriberHelp(){
      return this.subscriberHelp;
  }
  public Boolean subscriberOptout(){
      return this.subscriberOptout;
  }
  public Boolean subscriberOptin(){
      return this.subscriberOptin;
  }
  public Boolean directLending(){
      return this.directLending;
  }
  public Boolean ageGated(){
      return this.ageGated;
  }
  public Boolean embeddedPhone(){
      return this.embeddedPhone;
  }
  public Boolean embeddedLink(){
      return this.embeddedLink;
  }
  public String url(){
    return this.url;
  }
  public String method(){
    return this.method;
  }


  @Override
  protected Call<CampaignCreateResponse> obtainCall() {
    return client().getApiService().createCampaign(client().getAuthId(), this);
  }
}