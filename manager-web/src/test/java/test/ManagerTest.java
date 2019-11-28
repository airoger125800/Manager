package test;

import mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class ManagerTest {

    @Autowired
    private UserMapper userMapper ;

    @Test
    public void insertUser () {
        User user = new User();
        user.setUserAge(24);
        user.setUserName("陈欣冉");
        user.setUserId(2);
        userMapper.insertUser(user);
    }
}
