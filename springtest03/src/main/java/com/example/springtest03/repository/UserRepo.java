package com.example.springtest03.repository;

import com.example.springtest03.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername (String username);


}
