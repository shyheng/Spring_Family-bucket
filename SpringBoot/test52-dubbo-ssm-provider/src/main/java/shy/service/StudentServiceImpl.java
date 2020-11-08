package shy.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shy.springboot.mapper.StudentMapper;
import shy.springboot.model.Student;

@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryId(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
