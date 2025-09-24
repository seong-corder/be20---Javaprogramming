package Main.java.com.jiraffers.persistence;

import Main.java.com.jiraffers.domain.User;
import Main.java.com.jiraffers.repository.UserRepository;

import java.util.*;

public class UserRepositoryImpl implements UserRepository {

    private final Map<Integer, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User findById(int id) {
        return users.get(id);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}