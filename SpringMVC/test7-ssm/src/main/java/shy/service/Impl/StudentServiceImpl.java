package shy.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shy.dao.StudentDao;
import shy.domain.Student;
import shy.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

//    引用类型的自动注入
//    @Resource我的用不了
    @Resource
    private StudentDao studentDao;



    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudent() {
        return studentDao.selectStudent();
    }
}
