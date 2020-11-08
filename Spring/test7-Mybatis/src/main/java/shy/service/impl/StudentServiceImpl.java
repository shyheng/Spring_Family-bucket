package shy.service.impl;

import shy.dao.StudentDao;
import shy.domain.Student;
import shy.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
//    引用类型
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> students = studentDao.selectStudent();
        return students;
    }
}
