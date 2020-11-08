package shy.service.impl;

import org.springframework.stereotype.Service;
import shy.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String shy() {
        return "我爱你";
    }
}
