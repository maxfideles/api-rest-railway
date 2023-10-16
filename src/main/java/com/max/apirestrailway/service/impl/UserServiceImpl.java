package com.max.apirestrailway.service.impl;

import com.max.apirestrailway.domain.model.User;
import com.max.apirestrailway.domain.repository.UserRepository;
import com.max.apirestrailway.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User finById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This user already exists!");
        }
        return userRepository.save(userToCreate);
    }
}
