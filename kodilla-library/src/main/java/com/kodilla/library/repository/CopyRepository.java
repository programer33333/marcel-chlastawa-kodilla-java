package com.kodilla.library.repository;

import com.kodilla.library.domain.Copy;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface CopyRepository extends CrudRepository<Copy, Long> {

    @Override
    Optional<Copy> findById(Long copyId);

    @Override
    void deleteById(Long copyId);

    @Override
    Copy save(Copy copy);

    @Override
    List<Copy> findAll();
}