package com.example.springbootunittest;

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
}
