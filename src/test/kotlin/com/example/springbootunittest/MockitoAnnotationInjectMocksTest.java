package com.example.springbootunittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author zhixiao.mzx
 * @date 2019-05-26
 */
@ExtendWith(MockitoExtension.class)
public class MockitoAnnotationInjectMocksTest {
    @InjectMocks
    private UserService userService;

    @Mock
    private NameService nameService;

    @Test
    public void getUser() {
        Long id = 123L;
        String name = "test";
        Mockito.doReturn(name).when(nameService).getName(Mockito.anyLong());

        User result = userService.getUser(id);
        Assertions.assertEquals(name, result.getName());
    }
}
