package com.example.springbootunittest;

/**
 * @author zhixiao.mzx
 * @date 2019-05-25
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            '}';
    }
}
