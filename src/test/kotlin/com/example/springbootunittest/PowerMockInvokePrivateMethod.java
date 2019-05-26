package com.example.springbootunittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.powermock.reflect.Whitebox;

/**
 * @author zhixiao.mzx
 * @date 2019-05-26
 */
@ExtendWith(MockitoExtension.class)
public class PowerMockInvokePrivateMethod {
    @Mock
    private UserService userService = new UserService();

    @Test
    public void generateRandomName() throws Exception {
        // 也可以使用 org.springframework.test.util.ReflectionTestUtils.invokeMethod
        Object randomName = Whitebox.invokeMethod(userService, "generateRandomName");
        Assertions.assertNotNull(randomName);
    }
}
