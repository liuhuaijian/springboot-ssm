package cn.springboot.text.service.impl;

import cn.springboot.text.dao.UserMapper;
import cn.springboot.text.entity.User;
import cn.springboot.text.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Override
    public User getUserSubmit(String name, String password) {
        return userMapper.getUserSubmit(name, password);
    }

    @Override
    public List<User> findUserListByPage(User user){
        return userMapper.findUserListByPage(user);
    }
    //用户信息展示
    public List<User> getUsers(){
        return userMapper.getUsers();
    }

}
