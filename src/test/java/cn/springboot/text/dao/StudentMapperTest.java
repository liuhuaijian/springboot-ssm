package cn.springboot.text.dao;

import cn.springboot.text.TextApplication;
import cn.springboot.text.entity.Student;
import cn.springboot.text.service.impl.StudentServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes={TextApplication.class})// 指定启动类
public class StudentMapperTest {
    @Autowired
    private StudentServiceImpl ssi;
    @Test
    public void selectByStudentSelective() {

        Student student = new Student();
        student.setName("明");
        System.out.println("只有名字时的查询");
        List<Student> list = ssi.selectByStudentSelective(student);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            //System.out.println(ToStringBuilder.reflectionToString(list.get(i), ToStringStyle.MULTI_LINE_STYLE));
        }

        student.setName(null);
        student.setSex((byte) 1);
        System.out.println();
    }

    @Test
    public void updateByPrimaryKeySelective() {
        Student student = new Student();
        student.setStId(1);
        student.setName("万金油");
        student.setPhone("1839303088");
        System.out.println(ssi.updateByPrimaryKeySelective(student));
    }

    @Test
    public void insertSelective() {
        List<Student> list = new LinkedList<>();
        Student student = new Student();
        student.setName("张亚龙");
        student.setPhone("13639096890");
        student.setEmail("zhangyalong@qq.com");
        student.setSex((byte)1);
        list.add(student);
        Student st1 = new Student();
        st1.setName("郭定业");
        st1.setPhone("13839303896");
        st1.setEmail("guodingye@qq.com");
        st1.setSex((byte)1);
        list.add(st1);
        for (Student s : list){
            System.out.println(ssi.insertSelective(s));
        }
    }

    @Test
    public void selectByIdOrName() {
        Student student = new Student();

    }

    @Test
    public void selectByStudentIdList() {
        List<Integer> ids = new LinkedList<>();
        ids.add(1);
        ids.add(9);
        List<Student> list = ssi.selectByStudentIdList(ids);
        for(Student student : list){
            System.out.println(student);
        }
    }

    @Test
    public void insertList() {
        List<Student> students = new LinkedList<>();
        Student st1 = new Student();
        st1.setName("薛颖");
        st1.setPhone("13839303896");
        st1.setEmail("xueying@qq.com");
        st1.setSex((byte)0);
        Student st2 = new Student();
        st2.setName("赵雅雯");
        st2.setPhone("13639306896");
        st2.setEmail("zhaoyawen@qq.com");
        st2.setSex((byte)0);

        students.add(st1);
        students.add(st2);
        System.out.println(ssi.insertList(students));
    }
}