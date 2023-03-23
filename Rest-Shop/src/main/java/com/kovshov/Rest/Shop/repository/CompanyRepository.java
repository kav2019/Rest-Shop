package com.kovshov.Rest.Shop.repository;

import com.kovshov.Rest.Shop.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
