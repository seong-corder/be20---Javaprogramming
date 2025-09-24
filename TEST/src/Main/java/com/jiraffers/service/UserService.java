package Main.java.com.jiraffers.service;

import Main.java.com.jiraffers.domain.User;
import Main.java.com.jiraffers.repository.UserRepository;

import java.util.List;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(int id, String username, String password, String email) {
        userRepository.save(new User(id, username, password, email));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
