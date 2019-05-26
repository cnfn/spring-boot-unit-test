package com.example.springbootunittest;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhixiao.mzx
 * @date 2019-05-25
 */
@Service
public class UserService {
    @Autowired
    private NameService nameService;

    public User getUser(Long id) {
        User user = new User();
        user.setName(nameService.getName(id));
        return user;
    }

    public User getUser(String name) {
        User user = new User();
        user.setName(name);
        return user;
    }

    public User generateUser() {
        User user = new User();
        user.setName(generateRandomName());

        return user;
    }

    private String generateRandomName() {
        return RandomStringUtils.randomAlphabetic(5);
    }
}
