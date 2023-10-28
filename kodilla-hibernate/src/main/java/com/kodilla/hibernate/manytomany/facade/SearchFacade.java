package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.kodilla.hibernate.manytomany.facade.SearchException.ERR_BAD_REQUEST;

@Service
public class SearchFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public SearchFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public void searchCompanyByNameFragment(String nameFragment) throws SearchException{
        List<Company> companyList = companyDao.retrieveByChars(nameFragment);
        LOGGER.info("Searching.....");
        if(!companyList.isEmpty()) {
            LOGGER.info("Found companies:");
            for (Company company : companyList) {
                LOGGER.info(company.getName());
            }
        } else {
            LOGGER.error(ERR_BAD_REQUEST);
            throw new SearchException(ERR_BAD_REQUEST);
        }
    }

    public void searchEmployeeByLastNameFragment(String lastNameFragment) throws SearchException {
        List<Employee> employees = employeeDao.findByChars(lastNameFragment);
        LOGGER.info("Searching.....");
        if(!employees.isEmpty()) {
            LOGGER.info("Found employees:");
            for (Employee employee : employees) {
                LOGGER.info(employee.getFirstname() + " " + employee.getLastname());
            }
        } else {
            LOGGER.error(ERR_BAD_REQUEST);
            throw new SearchException(ERR_BAD_REQUEST);
        }
    }
}
