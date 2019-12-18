package com.userfront.service.UserServiceImpl;

import com.userfront.Dao.UserDao;
import com.userfront.domain.User;
import com.userfront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired                      // dependency injection - if you need some instance you ask for it
    private UserDao userDao;        // Spring Boot give it base what I need

    public void save(User user) {
        userDao.save(user);
    }

    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    public boolean checkUserExists(String username, String email) {
        if (checkUsernameExists(username) || checkEmailExists(username)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkUsernameExists(String username) {
        if (findByUsername(username) != null) {
            return true;
        }
        return false;
    }

    public boolean checkEmailExists(String email) {
        if (findByEmail(email) != null) {
            return true;
        }
        return false;
    }

}
