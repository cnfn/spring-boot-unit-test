package com.example.springbootunittest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @author zhixiao.mzx
 * @date 2019-05-26
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(UserService.class)
public class PowerMockPrivateMethodTest {
    @Test
    public void generateName() throws Exception {
        String privateMethodName = "generateRandomName";

        UserService userService = PowerMockito.spy(new UserService());
        PowerMockito.when(userService, privateMethodName).thenReturn("xxx");

        User user = userService.generateUser();
        Assertions.assertEquals("xxx", user.getName());

        PowerMockito.verifyPrivate(userService).invoke(privateMethodName);
    }
}
