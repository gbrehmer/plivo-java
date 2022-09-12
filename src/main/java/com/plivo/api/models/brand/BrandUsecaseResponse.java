package com.plivo.api.models.brand;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import com.plivo.api.models.base.BaseResource;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandUsecaseResponse extends BaseResource {

    private List<useCase> useCases = new ArrayList<useCase>();
    private String brandId;

    /**
     * @return String return the getBrandId
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * @return String return the getBrandType
     */
    public List<useCase> getUseCases() {
        return useCases;
    }

    @Override                                      
    public String getId() {                        
        return this.brandId;                    
    }
  
}
