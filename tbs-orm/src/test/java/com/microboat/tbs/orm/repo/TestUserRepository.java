package com.microboat.tbs.orm.repo;

import com.microboat.tbs.orm.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestUserRepository {

    @Autowired
    private UserRepository userRepository;

    /**
     * 测试查询所有
     */
    @Test
    public void testQuery() {
        List<User> userList = userRepository.findAll();
        System.out.println(userList.size());
    }

    /**
     * 测试新增
     */
    @Test
    public void testInsert() {
        User user = new User();
        user.setUsername("test");
        user.setEmail("test@163.com");
        userRepository.save(user);

        System.out.println(user.getId());
    }
}
