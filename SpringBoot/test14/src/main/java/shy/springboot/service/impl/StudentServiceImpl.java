package shy.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shy.springboot.mapper.StudentMapper;
import shy.springboot.model.Student;
import shy.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentId(Integer id) {

        return studentMapper.selectByPrimaryKey(id);
    }
}
