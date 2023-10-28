package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    List<Company> retrieveByFirstChars(String COMPANY_NAME);

    @Query("SELECT c FROM Company c WHERE c.name LIKE %:nameFragment%")
    List<Company> retrieveByChars(@Param("nameFragment") String nameFragment);
}
