package com.max.apirestrailway.service;

import com.max.apirestrailway.domain.model.User;

public interface UserService {

    User finById(Long id);

    User create(User userToCreate);

}
