package antoniocostantin.progettosettimanalebe5.services;

import antoniocostantin.progettosettimanalebe5.entitites.User;
import antoniocostantin.progettosettimanalebe5.repositories.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public void save(User user) {
        userDao.save(user);
        System.out.println("User " + user + " saved");
    }

    public Optional<User> findById(int id) {
        return userDao.findById(id);
    }
}
