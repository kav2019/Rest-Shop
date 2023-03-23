package com.kovshov.Rest.Shop.service;

import com.kovshov.Rest.Shop.model.Company;
import com.kovshov.Rest.Shop.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> allCompany(){
        return companyRepository.findAll();
    }


}
