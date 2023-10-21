package com.kodilla.library.repository;

import com.kodilla.library.domain.User;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    Optional<User> findById(Long userId);

    @Override
    void deleteById(Long userId);

    @Override
    User save(User user);

    @Override
    List<User> findAll();
}