package cn.springboot.text.dao;

import cn.springboot.text.entity.Students;
import cn.springboot.text.entity.StudentsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StudentsMapper {
    int countByExample(StudentsExample example);

    int deleteByExample(StudentsExample example);

    int insert(Students record);

    int insertSelective(Students record);

    List<Students> selectByExample(StudentsExample example);

    int updateByExampleSelective(@Param("record") Students record, @Param("example") StudentsExample example);

    int updateByExample(@Param("record") Students record, @Param("example") StudentsExample example);
}