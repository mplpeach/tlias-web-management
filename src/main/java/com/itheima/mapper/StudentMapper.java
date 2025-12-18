package com.itheima.mapper;

import com.itheima.pojo.Student;
import com.itheima.pojo.StudentQueryParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    /**
     * 根据班级id查询班级信息
     * @param clazzId 班级id
     */
    @Select("select 1 from student where clazz_id = #{clazzId} limit 1")
    Integer existsByClazzId(Integer clazzId);

    /**
     * 分页查询班级信息
     * @param studentQueryParam 查询参数
     */
    List<Student> page(StudentQueryParam studentQueryParam);
}
