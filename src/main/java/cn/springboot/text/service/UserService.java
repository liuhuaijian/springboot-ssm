package cn.springboot.text.service;

import cn.springboot.text.entity.User;

import java.util.List;

public interface UserService {
    //登录查询
    User getUserSubmit(String name, String password);
    //分页查询
    List<User> findUserListByPage(User user);
    //用户信息展示
    List<User> getUsers();
}
