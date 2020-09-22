package com.fastcar.example.service.user;

import com.fastcar.example.domain.User;
import com.fastcar.example.domain.UserCreateForm;

import java.util.Collection;
import java.util.Optional;


public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
