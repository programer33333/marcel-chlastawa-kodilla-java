package com.kodilla.library.repository;

import com.kodilla.library.domain.Rental;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface RentalRepository extends CrudRepository<Rental, Long> {

    @Override
    Optional<Rental> findById(Long rentalId);

    @Override
    void deleteById(Long rentalId);

    @Override
    Rental save(Rental rental);

    @Override
    List<Rental> findAll();
}