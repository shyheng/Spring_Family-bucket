package shy.service;

import shy.springboot.model.Student;

public interface StudentService {
    Student queryStudentId(Integer id);

    Integer queryAll();
}
