package shy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shy.springboot.mapper.StudentMapper;
import shy.springboot.model.Student;
import shy.springboot.service.StudentSerice;

@Service
public class StudentSericeImpl implements StudentSerice {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Integer queryStudentAll() {
        return studentMapper.selectStudentAll();
    }
}
