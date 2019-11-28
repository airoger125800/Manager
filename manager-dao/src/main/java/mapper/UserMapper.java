package mapper;

import pojo.User;

import java.util.List;

public interface UserMapper {
    void insertUser(User user);
    List<User> selectUserAll();

//    测试修改源代码后再重新上传到github
}
