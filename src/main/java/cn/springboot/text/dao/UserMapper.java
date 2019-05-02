package cn.springboot.text.dao;

import cn.springboot.text.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    //登录查询
    @Select("select * from `user` where name = #{name} and password = #{password}")
    User getUserSubmit(@Param("name") String name, @Param("password") String password);

    //用户信息展示
    @Select("select * from `user` ")
    List<User> getUsers();
    //分页
    List<User> findUserListByPage(User user);
}
