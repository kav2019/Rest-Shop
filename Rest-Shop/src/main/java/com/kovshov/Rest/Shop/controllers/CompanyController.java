package com.kovshov.Rest.Shop.controllers;

import com.kovshov.Rest.Shop.dto.CompanyDTO;
import com.kovshov.Rest.Shop.facade.CompanyFacade;
import com.kovshov.Rest.Shop.model.Company;
import com.kovshov.Rest.Shop.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyService companyService;
    private final CompanyFacade companyFacade;

    @Autowired
    public CompanyController(CompanyService companyService, CompanyFacade companyFacade) {
        this.companyService = companyService;
        this.companyFacade = companyFacade;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CompanyDTO>> getAllCompany(){
        List<CompanyDTO> companyDTOList = companyService.allCompany()
                .stream()
                .map(companyFacade::companyToCompanyDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(companyDTOList, HttpStatus.OK);
    }
}
