package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    List<Employee> findByLastname(String LASTNAME);

    @Query("SELECT e FROM Employee e WHERE e.lastname LIKE %:lastNameFragment%")
    List<Employee> findByChars(@Param("lastNameFragment") String lastNameFragment);
}
