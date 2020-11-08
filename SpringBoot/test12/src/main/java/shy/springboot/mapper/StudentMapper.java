package shy.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import shy.springboot.model.Student;

@Mapper//扫描dao接口
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}