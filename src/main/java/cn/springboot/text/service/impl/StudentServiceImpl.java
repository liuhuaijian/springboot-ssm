package cn.springboot.text.service.impl;

import cn.springboot.text.dao.StudentMapper;
import cn.springboot.text.entity.Student;
import cn.springboot.text.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public Student selectByPrimaryKey(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Student student) {
        return studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public List<Student> selectBetweenCreatedTime(Map<String, Object> params) {
        return studentMapper.selectBetweenCreatedTime(params);
    }

    @Override
    public List<Student> selectBetweenCreatedTimeAnno(Date bTime, Date eTime) {
        return studentMapper.selectBetweenCreatedTimeAnno(bTime,eTime);
    }

    @Override
    public List<Student> selectByStudentSelective(Student student) {
        return studentMapper.selectByStudentSelective(student);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public Student selectByIdOrName(Student record) {
        return studentMapper.selectByIdOrName(record);
    }

    @Override
    public List<Student> selectByStudentSelectiveWhereTag(Student student) {
        return studentMapper.selectByStudentSelectiveWhereTag(student);
    }

    @Override
    public List<Student> selectByStudentIdList(List<Integer> ids) {
        return studentMapper.selectByStudentIdList(ids);
    }

    @Override
    public int insertList(List<Student> students) {
        return studentMapper.insertList(students);
    }
}
