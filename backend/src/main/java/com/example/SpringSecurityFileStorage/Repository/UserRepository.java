package com.example.SpringSecurityFileStorage.Repository;

import com.example.SpringSecurityFileStorage.Entity.Role;
import com.example.SpringSecurityFileStorage.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    User findByRole(Role role);
}
