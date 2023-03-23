package com.kovshov.Rest.Shop.facade;

import com.kovshov.Rest.Shop.dto.CompanyDTO;
import com.kovshov.Rest.Shop.model.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyFacade {
    public CompanyDTO companyToCompanyDTO(Company company){
        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setTitle(company.getTitle());
        companyDTO.setDescription(company.getDescription());
        companyDTO.setLogo(company.getLogo());
        companyDTO.setOwner(company.getOwner().getEmail());
        companyDTO.setItems(company.getItemsListTitle());
        return companyDTO;
    }
}
