package com.userfront.dao;

import com.userfront.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);       // whatever after findBy ... String username -> User class
    User findByEmail(String email);
}
