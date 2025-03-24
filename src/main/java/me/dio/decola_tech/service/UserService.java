package me.dio.decola_tech.service;

import me.dio.decola_tech.Domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
