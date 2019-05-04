package cn.springboot.text.service.impl;

import cn.springboot.text.TextApplication;
import cn.springboot.text.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes={TextApplication.class})// 指定启动类
public class StudentServiceImplTest {
    @Autowired
    private StudentServiceImpl ssi;
    @Test
    public void selectByStudentSelective() {
        Student student = new Student();
        student.setName("杨世琴");

        List<Student> list = ssi.selectByStudentSelective(student);
        for(Student s : list){
            System.out.println(s);
        }

    }
}