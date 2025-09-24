package Main.java.com.jiraffers.repository;

import Main.java.com.jiraffers.domain.User;
import java.util.List;

public interface UserRepository {
    void save(User user);
    User findById(int id);
    List<User> findAll();

}
