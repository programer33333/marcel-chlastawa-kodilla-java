package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class SeatchFacadeTestSuite {

    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @AfterEach
    public void cleanUp() {
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }

    @Test
    public void shouldSearchCompaniesByFragmentOfName() {
        // Given
        companyDao.save(new Company("ABC Company"));
        companyDao.save(new Company("XYZ Corporation"));
        companyDao.save(new Company("123 Enterprises"));

        // When
        try {
            searchFacade.searchCompanyByNameFragment("assss");
        } catch (SearchException e) {}
    }

    @Test
    public void shouldSearchEmployeesByFragmentOfLastName() {
        // Given
        employeeDao.save(new Employee("John", "Smith"));
        employeeDao.save(new Employee("Alice", "Johnson"));
        employeeDao.save(new Employee("Bob", "Brown"));

        // When
        try {
            searchFacade.searchEmployeeByLastNameFragment("h");
        } catch (SearchException e) {}
    }
}
