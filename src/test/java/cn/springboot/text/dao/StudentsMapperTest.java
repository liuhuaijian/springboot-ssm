package cn.springboot.text.dao;

import cn.springboot.text.TextApplication;
import cn.springboot.text.entity.Students;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes={TextApplication.class})// 指定启动类
public class StudentsMapperTest {
    @Autowired
    private StudentsMapper sm;

    @Test
    public void countByExample() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void insert() {
        Students students = new Students();
        students.setName("高巧兰");
        students.setPhone("13639303890");
        students.setEmail("gaoqiaolan@qq.com");
        students.setSex((byte) 1);
        System.out.println(sm.insert(students));

    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExample() {
    }
}