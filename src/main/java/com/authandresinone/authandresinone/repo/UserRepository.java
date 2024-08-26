package com.authandresinone.authandresinone.repo;


import com.authandresinone.authandresinone.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    UserEntity findByUsername(String username);

    UserEntity findByUserId(UUID userId);
}
