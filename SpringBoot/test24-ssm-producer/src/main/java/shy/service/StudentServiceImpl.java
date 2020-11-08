package shy.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import shy.springboot.mapper.StudentMapper;
import shy.springboot.model.Student;

import java.util.concurrent.TimeUnit;

@Component
@Service(interfaceClass = StudentService.class ,version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public Student queryStudentId(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer queryAll() {
//        提升系统性能
//        首先去Redis找，没有，去数据库，并放到数据库中
        Integer allStudent = (Integer) redisTemplate.opsForValue().get("allStudent");
        if (null == allStudent){
//            去数据库找
            allStudent = studentMapper.selectAllStudent();

//            存放到数据库
            redisTemplate.opsForValue().set("allStudent",allStudent,30, TimeUnit.SECONDS);
        }
        return allStudent;
    }
}
