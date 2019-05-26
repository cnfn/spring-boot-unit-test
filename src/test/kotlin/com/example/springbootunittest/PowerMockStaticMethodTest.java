package com.example.springbootunittest;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @author zhixiao.mzx
 * @date 2019-05-26
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(NameService.class)
public class PowerMockStaticMethodTest {
    @Test
    public void randomAlphabetic() {
        PowerMockito.mockStatic(NameService.class);
        Mockito.when(NameService.generateName()).thenReturn("xxx");

        String name = NameService.generateName();
        Assertions.assertEquals("xxx", name);
    }
}
