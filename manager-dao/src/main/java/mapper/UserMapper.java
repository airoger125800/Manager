package mapper;

import pojo.User;

import java.util.List;

public interface UserMapper {
    void insertUser(User user);
    List<User> selectUserAll();
}
