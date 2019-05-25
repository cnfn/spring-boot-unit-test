package com.example.springbootunittest;

import org.springframework.stereotype.Service;

/**
 * @author zhixiao.mzx
 * @date 2019-05-25
 */
@Service
public class NameService {
    public String getName(Long id) {
        return id.toString();
    }
}
