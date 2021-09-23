package com.example.springtest03.service;

import com.example.springtest03.entity.UserEntity;
import com.example.springtest03.exception.UserAlreadyExistException;
import com.example.springtest03.exception.UserNotFoundException;
import com.example.springtest03.model.User;
import com.example.springtest03.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;


    public UserEntity registration(UserEntity user) throws UserAlreadyExistException {
        if(userRepo.findByUsername(user.getUsername()) != null){
           throw  new UserAlreadyExistException("Пользователь с таким именем уже существует!");
        }
        return userRepo.save(user);
    }

    public User getOne(Long id) throws UserNotFoundException {
        UserEntity user = userRepo.findById(id).get();
        if (user == null){
            throw new UserNotFoundException("Пользователь не найден");
        }
        return User.toModel(user);
    }
    public Long delete(Long id){
        userRepo.deleteById(id);
        return id;
    }
}
