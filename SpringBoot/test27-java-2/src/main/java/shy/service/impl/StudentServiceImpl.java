package shy.service.impl;

import org.springframework.stereotype.Service;
import shy.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String shy(String ma) {
        return "我爱你"+ma;
    }
}
