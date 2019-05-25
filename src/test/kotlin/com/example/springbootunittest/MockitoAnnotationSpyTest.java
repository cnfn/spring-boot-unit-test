package com.example.springbootunittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author zhixiao.mzx
 * @date 2019-05-25
 */
@ExtendWith(MockitoExtension.class)
public class MockitoAnnotationSpyTest {
    @Spy
    private UserService userService;

    @Test
    void getUser() {
        Long id = 123L;
        User user = new User();
        user.setName(id.toString());

        Mockito.doReturn(user).when(userService).getUser(id);

        User result = userService.getUser(id);
        Assertions.assertEquals(user.getName(), result.getName());

        result = userService.getUser("xxx");
        Assertions.assertEquals("xxx", result.getName());
    }
}
