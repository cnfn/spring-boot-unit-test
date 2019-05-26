package com.example.springbootunittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author zhixiao.mzx
 * @date 2019-05-26
 */
@ExtendWith(MockitoExtension.class)
public class MockitoAnnotationCaptorTest {
    @Mock
    private UserService userService;

    @Captor
    private ArgumentCaptor<Long> argumentCaptor;

    @Test
    public void getUser() {
        Long id = 123L;
        userService.getUser(id);

        Mockito.verify(userService).getUser(argumentCaptor.capture());

        Assertions.assertEquals(id, argumentCaptor.getValue());
    }
}
