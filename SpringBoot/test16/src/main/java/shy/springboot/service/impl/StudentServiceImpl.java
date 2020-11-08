package shy.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import shy.springboot.mapper.StudentMapper;
import shy.springboot.model.Student;
import shy.springboot.service.StudentService;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Transactional
    public int updeta(Student student) {
        //    修改成功
        int i = studentMapper.updateByPrimaryKeySelective(student);

//        失败
        int a = 0;
        return i;
    }
}
